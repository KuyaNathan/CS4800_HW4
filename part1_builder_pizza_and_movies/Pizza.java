import java.util.List;

public class Pizza {
    private String size;
    private List<String> toppings;
    private String pizzaChain = "";

    public Pizza(String size, List<String> toppings, String pizzaChain){
        this.size = size;
        this.toppings = toppings;
        this.pizzaChain = pizzaChain;
    }

    public String toString(){
        return ("Pizza Chain: " + pizzaChain + ",\tSize: " + size + ",\tToppings: " + String.join(", ", toppings));
    }

    public void eat(){
        System.out.println(this.toString());
    }
}
