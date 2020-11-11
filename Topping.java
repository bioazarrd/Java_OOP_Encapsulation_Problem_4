package D_JavaAdvancedOOP.Lecture3_Encapsulation.ExProblem4;
public class Topping {

    private String toppingType;
    private double weight;


    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }


    private void setToppingType(String toppingType) {
        if ((toppingType.equals("Meat")) ||
                (toppingType.equals("Veggies")) ||
                (toppingType.equals("Cheese")) ||
                (toppingType.equals("Sauce"))) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalStateException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight > 0 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalStateException(this.toppingType + " weight should be in the range [1..50].");
        }
    }


    public double calculateCalories() {
        if (this.toppingType.equals("Meat")) {
            return (2 * this.weight) * ToppingsModifiers.MEAT.getModifier();
        } else if (this.toppingType.equals("Veggies")) {
            return (2 * this.weight) * ToppingsModifiers.VEGGIES.getModifier();
        } else if (this.toppingType.equals("Cheese")) {
            return (2 * this.weight) * ToppingsModifiers.CHEESE.getModifier();
        }
        return (2 * this.weight) * ToppingsModifiers.SAUCE.getModifier();
    }


}
