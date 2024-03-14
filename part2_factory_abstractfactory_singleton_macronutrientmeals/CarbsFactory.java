import java.util.Random;

public class CarbsFactory {
    private static CarbsFactory carbsFactory;
    private CarbsFactory(){}

    public static CarbsFactory getInstance(){
        if(carbsFactory == null){
            carbsFactory = new CarbsFactory();
        }
        return carbsFactory;
    }

    public Carbs createCarbs(String dietPlan){
        switch(dietPlan.toLowerCase()){
            case "no restriction":
                return getRandomCarbs(new Carbs[]{new Cheese(), new Bread(), new Lentils(), new Pistachio()});
            case "paleo":
                return new Pistachio();
            case "vegan":
                return getRandomCarbs(new Carbs[]{new Bread(), new Lentils(), new Pistachio()});
            case "nut allergy":
                return getRandomCarbs(new Carbs[]{new Cheese(), new Bread(), new Lentils()});
            default:
                System.out.println("Please enter a valid diet plan");
                return null;
        }
    }

    public Carbs getRandomCarbs(Carbs[] choices){
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }
}
