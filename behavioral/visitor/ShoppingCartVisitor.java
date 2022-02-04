package behavioral.visitor;


public class ShoppingCartVisitor implements IShoppingCartVisitor {

    @Override
    public int visit(Book book) {

        int cost = book.getPrice();

        // apply 5$ discount if book price is greater than 50
        if (cost > 50) cost = cost - 5;
        
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost=" + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit name::" + fruit.getName() + " cost=" + cost);
        return cost;
    }
}
