package visitor.mall;

import lombok.Getter;

@Getter
public class Book implements ItemElement {
    //Concrete Element
    private final int price;
    private final String isbnNumber;

    public Book(int cost, String isbn) {
        this.price = cost;
        this.isbnNumber = isbn;
    }


    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
