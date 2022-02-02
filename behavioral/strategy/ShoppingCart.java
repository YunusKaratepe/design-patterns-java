package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    // List of items
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();    
    }

    public void addItem(Item i) {
        this.items.add(i);
    }

    public void removeItem(Item i) {
        this.items.remove(i);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item i: items) {
            sum += i.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
        // empty the items list
        this.items = new ArrayList<Item>();
    }


}
