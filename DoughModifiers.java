package D_JavaAdvancedOOP.Lecture3_Encapsulation.ExProblem4;
public enum DoughModifiers {

    WHITE(1.5),
    WHOLEGRAIN(1.0);


    private double doughModifiers;


    DoughModifiers(double doughModifiers) {
        this.doughModifiers = doughModifiers;
    }



    public double getDoughModifiers() {
        return doughModifiers;
    }


}
