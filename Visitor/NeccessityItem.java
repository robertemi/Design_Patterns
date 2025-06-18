package Visitor;

public class NeccessityItem extends Item{

    TaxVisitor visitor;

    public NeccessityItem(double price, String description, TaxVisitor visitor) {
        super(price, description);
        this.visitor = visitor;
    }
    
    @Override
    public double price() {
        return super.price();
    }

    @Override
    public void setPrice(double newPrice) {
        super.setPrice(newPrice);
    }

    @Override
    public void accept() {
        visitor.visit(this);
    }

    
}