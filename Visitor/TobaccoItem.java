package Visitor;

public class TobaccoItem extends Item{

    TaxVisitor visitor;

    public TobaccoItem(double price, String description, TaxVisitor visitor) {
        super(price, description);
        this.visitor = visitor;
    }

    @Override
    public void accept() {
        visitor.visit(this);
    }

    @Override
    public double price() {
        return super.price();
    }

    @Override
    public void setPrice(double newPrice) {
        super.setPrice(newPrice);
    }

    
    
}