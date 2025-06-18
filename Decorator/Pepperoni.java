package Decorator;

public class Pepperoni extends ToppingMaker{
    Pizza pizza;

    public Pepperoni(Pizza newPizza) {
        super(newPizza);
        System.out.println("Pepperoni");
    }

    public double getCost(){
        return pizza.getCost() + 1.00;
    }

    public String getDescription(){
        return pizza.getDescription() + " Pepperoni";
    }

}