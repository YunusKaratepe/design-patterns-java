package behavioral.visitor;

public interface ItemElement {
    public int accept(IShoppingCartVisitor visitor);
}
