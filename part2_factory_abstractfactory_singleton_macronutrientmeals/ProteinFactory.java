import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory proteinFactory;
    private ProteinFactory(){}

    public static ProteinFactory getInstance(){
        if(proteinFactory == null){
            proteinFactory = new ProteinFactory();
        }
        return proteinFactory;
    }

    public Protein createProtein(String dietPlan){
        switch(dietPlan.toLowerCase()){
            case "no restriction":
                return getRandomProtein(new Protein[]{new Fish(), new Chicken(), new Beef(), new Tofu()});
            case "paleo":
                return getRandomProtein(new Protein[]{new Fish(), new Chicken(), new Beef()});
            case "vegan":
                return new Tofu();
            case "nut allergy":
                return getRandomProtein(new Protein[]{new Fish(), new Chicken(), new Beef(), new Tofu()});
            default:
                System.out.println("Please enter a valid diet plan");
                return null;
        }
    }

    public Protein getRandomProtein(Protein[] choices){
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }
}
