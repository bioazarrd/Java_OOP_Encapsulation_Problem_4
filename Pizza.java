package D_JavaAdvancedOOP.Lecture3_Encapsulation.ExProblem4;
import java.util.ArrayList;
import java.util.List;
public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;


    public Pizza(String name, int numberOfToppings) {
        this.setToppings(numberOfToppings);
        this.setName(name);
        this.setDough(dough);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings >= 0 && numberOfToppings < 10) {
            this.toppings = new ArrayList<>(numberOfToppings);
        } else {
            throw new IllegalStateException("Number of toppings should be in range [0..10].");
        }
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalStateException("Pizza name should be between 1 and 15 symbols.");
        } else {
            this.name = name.trim();
        }
    }


    public String getName() {
        return name;
    }

    public void addToppings(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double toppingsTotal = 0;
        for (Topping topping : toppings) {
            toppingsTotal += topping.calculateCalories();
        }
        return this.dough.calculateCalories() + toppingsTotal;
    }



}
