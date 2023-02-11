public class mBankMastercard extends CreditCardPayment {
    private double balance = 5.5;

    mBankMastercard(double val, String cardName, String typeOfCard) {
        super(val, cardName, typeOfCard);
    }

    @Override
    protected void paymentDetails() {
        super.paymentDetails();
        System.out.println("Saldo mBank: " + (this.balance -= this.amount));
        if (this.balance == 0) {
            System.out.println("Brak środków na koncie mBank");
        }
    }
}
