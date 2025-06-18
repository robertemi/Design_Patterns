package Visitor;

public abstract class Item implements Visitable{
    private double price;
    private String description;

    public Item(double price, String description){
        this.price = price;
        this.description = description;
    }

    public double price(){
        return this.price;
    }

    public String description(){
        return this.description;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }
}