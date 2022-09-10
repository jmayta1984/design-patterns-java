package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.cars.Car;
import creational.builder.director.Director;

public class Demo {

    public static void main(String[] args){
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);

        Car car = builder.construct();

        System.out.println("Car built:\n" + car.getCarType());
    }
}
