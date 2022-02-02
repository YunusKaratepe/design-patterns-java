package behavioral.strategy;

public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCardStrategy("Yunus Karatepe", "4534", "3230", "01.01.2025"));

        cart.addItem(item1);

        cart.pay(new PaypalStrategy("yunuskaratepe@mail.com", "123456789"));
    }
}
