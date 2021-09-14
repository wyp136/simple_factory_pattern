package simple_factory_model002;

public class Client {
    public static void main(String[] args) {
        Shape shape;
        shape = ShapeFactory.getShape("Circle");
        shape.draw();
        shape.erase();
    }
}
