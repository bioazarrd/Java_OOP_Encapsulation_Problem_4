package D_JavaAdvancedOOP.Lecture3_Encapsulation.ExProblem4;
public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);

    }

    private void setFlourType(String flourType) {
        if ((flourType.equals("White") ||
                (flourType.equals("Wholegrain") ||
                        (flourType.equals("Homemade"))))) {
            this.flourType = flourType;
        } else {
            throw new IllegalStateException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if ((bakingTechnique.equals("Crispy") ||
                (bakingTechnique.equals("Chewy") ||
                        (bakingTechnique.equals("Homemade"))))) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalStateException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight > 0 && weight < 201) {
            this.weight = weight;
        } else {
            throw new IllegalStateException("Dough weight should be in the range [1..200].");
        }
    }

    public String getFlourType() {
        return this.flourType;
    }


    public double calculateCalories() {
        if (this.flourType.equals("White")) {
            if (this.bakingTechnique.equals("Crispy")) {
                return (2 * this.weight) *
                        DoughModifiers.WHITE.getDoughModifiers() *
                        BakingTechnique.CRISPY.getBakingModifiers();
            } else if (this.bakingTechnique.equals("Chewy")) {
                return (2 * this.weight) *
                        DoughModifiers.WHITE.getDoughModifiers() *
                        BakingTechnique.CHEWY.getBakingModifiers();
            }
            return (2 * this.weight) *
                    DoughModifiers.WHITE.getDoughModifiers() *
                    BakingTechnique.HOMEMADE.getBakingModifiers();
        } else {
            if (this.bakingTechnique.equals("Crispy")) {
                return (2 * this.weight) *
                        DoughModifiers.WHOLEGRAIN.getDoughModifiers() *
                        BakingTechnique.CRISPY.getBakingModifiers();
            } else if (this.bakingTechnique.equals("Chewy")) {
                return (2 * this.weight) *
                        DoughModifiers.WHOLEGRAIN.getDoughModifiers() *
                        BakingTechnique.CHEWY.getBakingModifiers();
            }
            return (2 * this.weight) *
                    DoughModifiers.WHOLEGRAIN.getDoughModifiers() *
                    BakingTechnique.HOMEMADE.getBakingModifiers();
        }
    }




}
