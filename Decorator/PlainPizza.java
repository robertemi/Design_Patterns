package Decorator;

public class PlainPizza implements Pizza{

    @Override
    public double getCost() {
        return 10.00;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
    
}