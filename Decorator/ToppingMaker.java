package Decorator;

/**
 * Actual Decorator class
 */

public abstract class ToppingMaker implements Pizza{
    protected Pizza pizza;

    public ToppingMaker(Pizza newPizza){
        pizza = newPizza;
    }

    public double getCost(){
        return pizza.getCost();
    }

    public String getDescription(){
        return pizza.getDescription();
    }
}