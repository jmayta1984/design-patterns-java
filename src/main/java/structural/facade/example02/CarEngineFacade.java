package structural.facade.example02;


public class CarEngineFacade {

    private static int DEFAULT_COOLING_TEMP = 90;
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();

    public void startEngine(){
        starter.start();
        coolingController.setTemperatureLimit(90);
        coolingController.run();
    }
}
