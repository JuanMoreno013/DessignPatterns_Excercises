package decorator;

//Concrete Component
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
