//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Possible Pizza Sizes:\tSmall, Medium, Large");
        System.out.println("Possible Toppings:\n" + "Pepperoni\tPeppers\t\tHam"
                +"\nSausage\t\tChicken\t\tPesto\nMushrooms\tOlives\t\tSpicy Pork"
                +"\nBacon\t\tSpinach\t\tHam and Pineapple" +
                "\nOnions\t\tTomato and Basil\nBeef\t\tExtra Cheese");

        System.out.println("\nPizza Hut Pizzas: (create three pizzas, one of each size with 3, 6, 9 toppings and eat() all of them)");

        Pizza phPizza1 = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Small")
                .addTopping("Sausage").addTopping("Mushrooms").addTopping("Olives").buildPizza();
        Pizza phPizza2 = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Medium")
                .addTopping("Pepperoni").addTopping("Bacon").addTopping("Onions")
                .addTopping("Ham").addTopping("Olives").addTopping("Beef").buildPizza();
        Pizza phPizza3 = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Large")
                .addTopping("Olives").addTopping("Ham").addTopping("Tomato and Basil")
                .addTopping("Mushrooms").addTopping("Onions").addTopping("Bacon")
                .addTopping("Spicy Pork").addTopping("Beef").addTopping("Spinach").buildPizza();

        phPizza1.eat();
        phPizza2.eat();
        phPizza3.eat();

        System.out.println();
        System.out.println("Add the Little Caesar's and Domino's pizza chains to the program, "
                            + "create the specified pizzas and eat() all of them");

        Pizza phPizza4 = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Large")
                .addTopping("Bacon").addTopping("Sausage").addTopping("Pepperoni").buildPizza();
        Pizza phPizza5 = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Small")
                .addTopping("Chicken").addTopping("Pesto").buildPizza();
        Pizza lcPizza1 = new PizzaBuilder().setPizzaChain("Little Caesars").setSize("Medium")
                .addTopping("Pepperoni").addTopping("Sausage").addTopping("Bacon")
                .addTopping("Mushrooms").addTopping("Onions").addTopping("Olives")
                .addTopping("Peppers").addTopping("Extra Cheese").buildPizza();
        Pizza lcPizza2 = new PizzaBuilder().setPizzaChain("Little Caesars").setSize("Small")
                .addTopping("Spicy Pork").addTopping("Ham").addTopping("Peppers")
                .addTopping("Spinach").addTopping("Onions").addTopping("Bacon").buildPizza();
        Pizza domPizza1 = new PizzaBuilder().setPizzaChain("Dominos").setSize("Small")
                .addTopping("Ham and Pineapple").buildPizza();
        Pizza domPizza2 = new PizzaBuilder().setPizzaChain("Dominos").setSize("Large")
                .addTopping("Tomato and Basil").addTopping("Extra Cheese").addTopping("Bacon").buildPizza();

        phPizza4.eat();
        phPizza5.eat();
        System.out.println();
        lcPizza1.eat();
        lcPizza2.eat();
        System.out.println();
        domPizza1.eat();
        domPizza2.eat();

    }
}