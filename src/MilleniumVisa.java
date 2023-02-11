public class MilleniumVisa extends CreditCardPayment {
    private double balance = 8;

    MilleniumVisa(double val, String cardName, String typeOfcard) {
        super(val, cardName, typeOfcard);
    }

    @Override
    protected void paymentDetails() {
        super.paymentDetails();
        System.out.println("Saldo Millenium: " + (this.balance -= this.amount));
        if (this.balance == 0) {
            System.out.println("Brak środków na koncie Miellenium");
        }
    }
}
