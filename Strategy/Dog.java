package Strategy;

public class Dog extends Animal{

    public Dog(Fly flyes) {
        super(flyes);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Fly getFlyes() {
        return this.flyes;
    }

    @Override
    public void setFlyes(Fly newFlyes) {
        this.flyes = newFlyes;
    }

    
}