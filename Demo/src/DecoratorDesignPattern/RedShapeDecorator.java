package DecoratorDesignPattern;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape decoratedShape) {
        // Display message whenever function is called
        System.out.println("Border Color: Red");
    }
}
