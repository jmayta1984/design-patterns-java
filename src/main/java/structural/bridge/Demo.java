package structural.bridge;

public class Demo {

    public static void main(String[] args){
        Shape redCircle = new Circle( new RedCircle(),100, 10, 10);
        Shape greenCircle = new Circle( new GreenCircle(), 100,20,10);

        redCircle.draw();
        greenCircle.draw();;
    }
}
