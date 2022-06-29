package prototype;

abstract class Color implements Cloneable{

    protected String colorName;
    abstract void addColor();


    @Override
    public Color clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Color) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
