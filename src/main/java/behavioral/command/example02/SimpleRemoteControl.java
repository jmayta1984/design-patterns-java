package behavioral.command.example02;

public class SimpleRemoteControl {

    Command slot;
    public void setCommand(Command command){
        this.slot = command;
    }

    public void pressButton(){
        this.slot.execute();
    }
}
