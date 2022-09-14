package creational.factory.factories;

import creational.factory.products.Circle;
import creational.factory.products.Rectangle;
import creational.factory.products.Shape;
import creational.factory.products.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
