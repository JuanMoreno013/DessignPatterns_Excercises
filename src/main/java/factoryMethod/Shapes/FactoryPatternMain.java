package factoryMethod.Shapes;

public class FactoryPatternMain {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();


        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}



/*
            UML


                           Shape          <<Interface>>                                                 FactoryPattern

                          +draw(): void                                                                 +main(): void


                                                                                                             ~asks
                                                                                                          ShapeFactory
      ~Implements           ~Implements         ~Implements
                                                                           creates    <-------------------  +getShape():
        Circle              Square              Rectangle                                                     Shape

     +draw(): void          +draw(): void       +draw(): void


 */
