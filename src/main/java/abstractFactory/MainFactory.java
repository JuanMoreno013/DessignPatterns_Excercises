package abstractFactory;

public class MainFactory {
    public static void main(String[] args) {

        FactoryProvider factoryProvider = new FactoryProvider();

//        AnimalFactory dog = new AnimalFactory();

        AbstractFactory animalFactory = factoryProvider.getFactory("Animal");
        AbstractFactory colorFactory = factoryProvider.getFactory("Color");


        Animal dog = (Animal) animalFactory.create("Dog");
        Animal duck =  (Animal) animalFactory.create("duck");

        Color cBlue = (Color) colorFactory.create("blue");

        dog.makeSound();
        dog.getAnimal();


        System.out.println("First Animal");
        System.out.println(dog.getAnimal());
        System.out.println(dog.makeSound());
        System.out.println(cBlue.getColor());

        System.out.println("\nSecond Animal");
        System.out.println(duck.getAnimal());
        System.out.println(duck.makeSound());

    }
}
