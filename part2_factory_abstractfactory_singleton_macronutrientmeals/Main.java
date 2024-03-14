//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MealMakerAbstractFactory mealPlanner = new MealMakerAbstractFactory();

        Customer angie = new Customer("Angie", "No Restriction");
        Customer bruce = new Customer("Bruce", "Paleo");
        Customer chris = new Customer("Chris", "Vegan");
        Customer dani = new Customer("Dani", "Nut Allergy");
        Customer erica = new Customer("Erica", "Vegan");
        Customer frank = new Customer("Frank", "Paleo");


        Meal angieMeal = mealPlanner.makeMeal(angie.getDietPlan());
        Meal bruceMeal = mealPlanner.makeMeal(bruce.getDietPlan());
        Meal chrisMeal = mealPlanner.makeMeal(chris.getDietPlan());
        Meal daniMeal = mealPlanner.makeMeal(dani.getDietPlan());
        Meal ericaMeal = mealPlanner.makeMeal(erica.getDietPlan());
        Meal frankMeal = mealPlanner.makeMeal(frank.getDietPlan());

        angie.getCustomerDetails();
        angieMeal.showMeal();
        bruce.getCustomerDetails();
        bruceMeal.showMeal();
        chris.getCustomerDetails();
        chrisMeal.showMeal();
        dani.getCustomerDetails();
        daniMeal.showMeal();
        erica.getCustomerDetails();
        ericaMeal.showMeal();
        frank.getCustomerDetails();
        frankMeal.showMeal();
    }
}