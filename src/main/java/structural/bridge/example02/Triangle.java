package structural.bridge.example02;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle filled with color:");
        this.color.coloring();
    }
}
