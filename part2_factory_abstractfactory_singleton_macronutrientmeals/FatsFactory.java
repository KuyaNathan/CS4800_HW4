import java.util.Random;

public class FatsFactory {
    private static FatsFactory fatsFactory;
    private FatsFactory(){}

    public static FatsFactory getInstance(){
        if(fatsFactory == null){
            fatsFactory = new FatsFactory();
        }
        return fatsFactory;
    }

    public Fats createFats(String dietPlan){
        switch(dietPlan.toLowerCase()){
            case "no restriction":
                return getRandomFats(new Fats[]{new Avocado(), new SourCream(), new Tuna(), new Peanuts()});
            case "paleo":
                return getRandomFats(new Fats[]{new Avocado(), new Tuna(), new Peanuts()});
            case "vegan":
                return getRandomFats(new Fats[]{new Avocado(), new Peanuts()});
            case "nut allergy":
                return getRandomFats(new Fats[]{new Avocado(), new SourCream(), new Tuna()});
            default:
                System.out.println("Please enter a valid diet plan");
                return null;
        }
    }

    public Fats getRandomFats(Fats[] choices){
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }
}
