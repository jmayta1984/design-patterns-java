package behavioral.command.example02;

public class Demo {

    public static void main(String[] args){
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = new Light();
        Stereo stereo = new Stereo();

        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();

        remoteControl.setCommand(new StereoOnCommand(stereo));
        remoteControl.pressButton();
    }
}
