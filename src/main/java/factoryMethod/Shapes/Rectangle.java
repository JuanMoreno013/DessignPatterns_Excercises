package factoryMethod.Shapes;

public class Rectangle implements Shape{
    @Override
    public void draw() {  //ConcreteProduct?
        System.out.println("Inside Rectangle::draw() method");
    }
}
