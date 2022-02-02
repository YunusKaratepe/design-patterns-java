package behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String number, String cvv, String dateOfExp) {
        this.name = name;
        this.cardNumber = number;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExp;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with creadit/debit card.");
    }

    
}
