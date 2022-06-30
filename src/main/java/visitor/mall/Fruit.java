package visitor.mall;

import lombok.Getter;

@Getter
public class Fruit implements ItemElement {
    //Concrete Element
    private final int pricePerKg;
    private final int weight;
    private final String name;

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
