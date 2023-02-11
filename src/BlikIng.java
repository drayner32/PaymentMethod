public class BlikIng extends PaymentMethod{
    private double balance = 10;
    BlikIng(double val) {
        super(val);
    }

    @Override
    protected void paymentDetails() {
        super.paymentDetails();
        System.out.println("Zapłacono blikiem, pozostało środków na koncie: " + (this.balance -= this.amount));

    }
}
