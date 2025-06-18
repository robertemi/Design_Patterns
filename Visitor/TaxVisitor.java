package Visitor;

public class TaxVisitor implements Visitor {

    @Override
    public void visit(Item item) {
        if (item instanceof LiquorItem){
            item.setPrice(item.price() + item.price() * 0.30);
        }
        else if (item instanceof TobaccoItem) {
            item.setPrice(item.price() + item.price() * 0.40);
        }
        else{
            item.setPrice(item.price() + item.price() * 0.05);
        }
    }

}