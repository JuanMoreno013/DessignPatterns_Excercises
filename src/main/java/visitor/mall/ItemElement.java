package visitor.mall;

//Element
public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
