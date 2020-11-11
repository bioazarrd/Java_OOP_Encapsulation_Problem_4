package D_JavaAdvancedOOP.Lecture3_Encapsulation.ExProblem4;
public enum BakingTechnique {

    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);


    private double bakingTechnique;


    BakingTechnique(double bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }



    public double getBakingModifiers() {
        return this.bakingTechnique;
    }






}
