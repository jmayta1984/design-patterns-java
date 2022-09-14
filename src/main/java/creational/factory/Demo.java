package creational.factory;

import creational.factory.factories.ShapeFactory;
import creational.factory.products.Shape;

public class Demo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");

        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        rectangle.draw();
    }
}
