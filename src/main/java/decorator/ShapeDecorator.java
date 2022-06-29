package decorator;

//Base Decorator
public abstract class ShapeDecorator implements Shape{

    // Protected variable
    protected Shape decoratedShape;

    // Method 1
    // Abstract class constructor
    public ShapeDecorator(Shape decoratedShape)
    {
        // This keyword refers to current object itself
        this.decoratedShape = decoratedShape;
    }

    // Method 2 - draw()
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
