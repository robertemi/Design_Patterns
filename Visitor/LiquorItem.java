package Visitor;

public class LiquorItem extends Item {

    TaxVisitor visitor;


    public LiquorItem(double price, String description, TaxVisitor visitor) {
        super(price, description);
        this.visitor = visitor;
    }

    @Override
    public void accept() {
        visitor.visit(this);
    }

    @Override
    public void setPrice(double newPrice) {
        super.setPrice(newPrice);
    }

    

    
}