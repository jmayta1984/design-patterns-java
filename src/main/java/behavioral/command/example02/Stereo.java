package behavioral.command.example02;

public class Stereo {

    public void on(){
        System.out.println("Stereo is on");
    }

    public void off(){
        System.out.println("Stereo is off");
    }

    public void setRadio(){
        System.out.println("Stereo is set for Radio");
    }

    public void setVolume(int volume){
        System.out.println("Stereo volume set to " + volume);
    }
}
