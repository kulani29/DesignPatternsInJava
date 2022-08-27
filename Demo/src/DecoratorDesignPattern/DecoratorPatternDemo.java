package DecoratorDesignPattern;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        Shape rectangle = new Rectangle();
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();


    }
}
