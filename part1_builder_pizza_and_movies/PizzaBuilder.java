import java.util.ArrayList;
import java.util.List;
public class PizzaBuilder {
    private String size;
    private List<String> toppings;
    private String pizzaChain;

    public PizzaBuilder setSize(String size){
        this.size = size;
        this.toppings = new ArrayList<>();
        return this;
    }

    public PizzaBuilder addTopping(String topping){
        toppings.add(topping);
        return this;
    }

    public PizzaBuilder setPizzaChain(String pizzaChain){
        this.pizzaChain = pizzaChain;
        return this;
    }

    public Pizza buildPizza(){
        return new Pizza(size, toppings, pizzaChain);
    }
}
