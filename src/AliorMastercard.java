public class AliorMastercard extends CreditCardPayment {
    private double balance = 20;

    AliorMastercard(double val, String cardName, String typeOfCard) {
        super(val, cardName, typeOfCard);
    }

    @Override
    protected void paymentDetails() {
        super.paymentDetails();
        System.out.println("Saldo Alior: " + (this.balance -= this.amount));
        if (this.balance == 0) {
            System.out.println("Brak środków na koncie Alior");
        }

    }
}
