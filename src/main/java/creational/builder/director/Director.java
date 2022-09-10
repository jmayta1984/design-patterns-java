package creational.builder.director;

import creational.builder.builders.Builder;
import creational.builder.cars.CarType;
import creational.builder.components.Engine;
import creational.builder.components.GPSNavigator;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

public class Director {

    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setEngine(new Engine(3.0,0));
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setSeats(2);
        builder.setTripComputer(new TripComputer());
    }

    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine(2.0,0));
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTransmission(Transmission.MANUAL);
        builder.setSeats(4);
        builder.setTripComputer(new TripComputer());
    }
}
