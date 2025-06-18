package Command;

public class CommandTurnOffTV implements Command{

    Device tv = new TV();

    public CommandTurnOffTV(Device tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.off();
    }

    
}