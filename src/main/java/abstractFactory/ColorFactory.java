package abstractFactory;

public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color create(String colorType) {
        if ("Blue".equalsIgnoreCase(colorType))
            return new Blue();

        else if ("Brown".equalsIgnoreCase(colorType)) {
            return new Brown();
        }

        return null;
    }
}
