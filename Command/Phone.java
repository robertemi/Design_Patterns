package Command;

public class Phone implements Device{

    @Override
    public void on() {
        System.out.println("Phone on");
    }

    @Override
    public void off() {
        System.out.println("Phone off");
    }

    
}