package simple_factory_model002;

import java.io.IOException;

public class ShapeFactory extends Exception {
    public static Shape getShape(String arg){
        Shape shape = null;
            if (arg.equalsIgnoreCase("Circle")) {
                shape = new Circle();
                System.out.println("初始化圆");
            } else if (arg.equalsIgnoreCase("Rectangle")) {
                shape = new Rectangle();
                System.out.println("初始化矩形");
            } else if (arg.equalsIgnoreCase("Triangle")) {
                shape = new Trangle();
                System.out.println("初始化三角形");
            }
            else
                System.out.println("UnsupportedShapeException");
        return shape;
    }
}
