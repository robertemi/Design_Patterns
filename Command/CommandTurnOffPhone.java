package Command;

public class CommandTurnOffPhone implements Command{

    Device phone = new Phone();

    public CommandTurnOffPhone(Device phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        this.phone.off();
    }

    
}