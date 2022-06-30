package visitor.mall;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartClient {
    public static void main(String[] args) {

        List<ItemElement> items = new ArrayList<>();

        items.add(new Book(20, "1234"));
        items.add(new Book(100, "5678"));
        items.add(new Fruit(10, 2, "Banana"));
        items.add(new Fruit(5, 5, "Apple"));


        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(List<ItemElement> items)
    {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
