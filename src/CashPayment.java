public class CashPayment extends PaymentMethod {
    private double balance = 1000;
    CashPayment(double val) {
        super(val);
    }

    @Override
    public void paymentDetails() {
        System.out.println("Payment amount is: " + this.getAmount() + " in cash");
        this.balance -= this.amount;
    }
}
