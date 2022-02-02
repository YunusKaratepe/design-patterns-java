package behavioral.strategy;

public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pw) {
        this.emailId = email;
        this.password = pw;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
    
}
