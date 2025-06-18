package Command;

public class CommandTurnOnTV implements Command{

    Device tv = new TV();

    public CommandTurnOnTV(Device tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.on();
    }

    
}