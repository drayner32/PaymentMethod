public class GiftCard extends PaymentMethod{
    public double balance = 3.5;

    GiftCard(double val) {
        super(val);
    }

    @Override
    protected void paymentDetails() {
        super.paymentDetails();
        System.out.println("Pozostało środków na karcie upominkowej: " + (this.balance -= this.amount));
    }
}
