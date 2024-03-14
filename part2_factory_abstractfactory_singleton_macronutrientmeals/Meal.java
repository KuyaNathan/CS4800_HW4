public class Meal {
    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public Meal(Carbs carbs, Protein protein, Fats fats){
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void showMeal(){
        carbs.getDetails();
        protein.getDetails();
        fats.getDetails();
        System.out.println();
    }
}
