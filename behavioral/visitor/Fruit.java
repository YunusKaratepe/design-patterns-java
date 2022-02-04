package behavioral.visitor;

public class Fruit implements ItemElement {
    
    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit (int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getPricePerKg() {
        return pricePerKg;
    }
    public int getWeight() {
        return weight;
    }

    public int accept(IShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
