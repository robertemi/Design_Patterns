package Strategy;

public abstract class Animal{
    Fly flyes;

    public Animal(Fly flyes){
        this.flyes = flyes;
    }

    public abstract Fly getFlyes();

    public abstract void setFlyes(Fly newFlyes);
}