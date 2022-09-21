package structural.facade.example02;

public class Demo {

    public static void main(String[] args){
        CarEngineFacade facade = new CarEngineFacade();

        facade.startEngine();
    }
}
