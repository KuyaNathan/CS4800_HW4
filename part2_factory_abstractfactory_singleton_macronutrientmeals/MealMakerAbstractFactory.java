public class MealMakerAbstractFactory {
    public Carbs createCarbsFactory(String dietPlan){
        return CarbsFactory.getInstance().createCarbs(dietPlan);
    }

    public Protein createProteinFactory(String dietPlan){
        return ProteinFactory.getInstance().createProtein(dietPlan);
    }

    public Fats createFatsFactory(String dietPlan){
        return FatsFactory.getInstance().createFats(dietPlan);
    }

    public Meal makeMeal(String dietPlan){
        Carbs carbs = this.createCarbsFactory(dietPlan);
        Protein protein = this.createProteinFactory(dietPlan);
        Fats fats = this.createFatsFactory(dietPlan);
        return new Meal(carbs, protein, fats);
    }
}
