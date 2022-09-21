package structural.facade.example01;

public class ShapeMaker {

    private Shape rectangle;
    private Shape triangle;
    private Shape square;

    public ShapeMaker() {
        this.rectangle = new Rectangle();
        this.triangle = new Triangle();
        this.square = new Square();
    }

    public void drawRectanle(){
        this.rectangle.draw();
    }

    public void drawTriangle(){
        this.triangle.draw();
    }

    public void drawSquare(){
        this.square.draw();
    }
}
