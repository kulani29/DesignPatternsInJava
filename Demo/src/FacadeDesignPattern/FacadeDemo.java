package FacadeDesignPattern;

public class FacadeDemo {

    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();
        maker.drawRectangle();
        maker.drawCircle();
        maker.drawSquare();
    }
}
