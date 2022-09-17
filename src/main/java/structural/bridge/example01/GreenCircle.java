package structural.bridge.example01;

public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle [green: red, radius " + radius + " x: " + x + " y: " + y);

    }
}
