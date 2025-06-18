package Strategy;

public class Duck extends Animal{

    public Duck(Fly flyes) {
        super(flyes);
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