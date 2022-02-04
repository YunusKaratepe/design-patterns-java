package behavioral.visitor;

public class Test {
    public static void main(String[] args) {
        ItemElement[] itemElements = new ItemElement[] {
            new Book(20, "1234"),
            new Book(100, "5678"),
            new Fruit(10, 2, "Banana"),
            new Fruit(20, 4, "Strawberry")
        };

        int totalPrice = calculatePrice(itemElements);
        System.out.println("Total price=" + totalPrice);
    }

    public static int calculatePrice(ItemElement[] items) {
        
        int sum = 0;
        IShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitor();

        for (ItemElement item : items) {
            sum += item.accept(shoppingCartVisitor);
        }
        return sum;
    }
}
