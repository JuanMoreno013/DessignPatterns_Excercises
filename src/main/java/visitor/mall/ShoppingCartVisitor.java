package visitor.mall;

//Visitor
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
