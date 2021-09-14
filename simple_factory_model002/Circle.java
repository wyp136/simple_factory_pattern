package simple_factory_model002;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }

    @Override
    public void erase() {
        System.out.println("清除一个圆");
    }
}
