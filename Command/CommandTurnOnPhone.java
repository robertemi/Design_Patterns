package Command;

public class CommandTurnOnPhone implements Command{

    Device phone = new Phone();

    public CommandTurnOnPhone(Device phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        this.phone.on();
    }

    
}