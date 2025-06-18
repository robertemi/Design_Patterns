package Decorator;

public class Client{
    public static void main(String[] args) {
        Pizza plain = new PlainPizza();
        System.out.println(plain.getCost());
        System.out.println(plain.getDescription());

        Pizza pep = new Pepperoni(plain);
        System.out.println(pep.getCost());
        System.out.println(pep.getDescription());
        
        Pizza p = new Pepperoni(new PlainPizza());
        System.out.println(p.getCost());
        System.out.println(p.getDescription());
        
    }
}