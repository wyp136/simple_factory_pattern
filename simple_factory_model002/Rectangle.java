package simple_factory_model002;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }

    @Override
    public void erase() {
        System.out.println("清除一个矩形");
    }
}
