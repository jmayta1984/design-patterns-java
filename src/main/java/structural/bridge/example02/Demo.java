package structural.bridge.example02;

public class Demo {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Yellow());
        triangle.applyColor();

        Shape square = new Square(new Green());
        square.applyColor();
    }
}
