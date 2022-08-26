package AbstractFactoryDesignPattern;

import java.util.Scanner;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
        Shape shape2 = shapeFactory2.getShape("RECTANGLE");
        shape2.draw();

    }
}
