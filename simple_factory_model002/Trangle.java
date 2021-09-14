package simple_factory_model002;

public class Trangle implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }

    @Override
    public void erase() {
        System.out.println("清除一个三角形");
    }
}
