package Visitor;

public class Client {

    public static void main(String[] args) {
        TaxVisitor visitor = new TaxVisitor();
        Item tob = new TobaccoItem(20.0, null, visitor);
        Item liq = new LiquorItem(30, null, visitor); 
        Item nec = new NeccessityItem(10, null, visitor);

        System.out.println(tob.price());
        System.out.println(liq.price());
        System.out.println(nec.price());

        tob.accept();
        liq.accept();
        nec.accept();

        
        System.out.println(tob.price());
        System.out.println(liq.price());
        System.out.println(nec.price());

    }
}