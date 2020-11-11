package D_JavaAdvancedOOP.Lecture3_Encapsulation.ExProblem4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean success = true;

        String[] inputPizza = reader.readLine().split("\\s+");
        String pizzaName = inputPizza[1];
        int numberOfToppings = Integer.parseInt(inputPizza[2]);
        Pizza pizza = null;

        try {
            pizza = new Pizza(pizzaName, numberOfToppings);
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            success = false;
        }


        if (success) {
            String[] inputDough = reader.readLine().split("\\s+");
            String doughType = inputDough[1];
            String bakingTechnique = inputDough[2];
            int weight = Integer.parseInt(inputDough[3]);
            Dough dough = null;

            try {
                dough = new Dough(doughType, bakingTechnique, weight);
                pizza.setDough(dough);
            } catch (IllegalStateException ise) {
                System.out.println(ise.getMessage());
                success = false;
            }
        }

        if (success) {
            String command = reader.readLine();
            while (!command.equals("END") && success) {
                String[] tokens = command.split("\\s+");
                String toppingType = tokens[1];
                int toppingWeight = Integer.parseInt(tokens[2]);
                Topping topping;


                try {
                    topping = new Topping(toppingType, toppingWeight);
                    pizza.addToppings(topping);
                } catch (IllegalStateException ise) {
                    System.out.println(ise.getMessage());
                    success = false;
                }

                command = reader.readLine();
            }
        }

        if (success) {
            System.out.printf("%s - %.2f%n", pizzaName, pizza.getOverallCalories());
        }

    }
}