public class CreditCardPayment extends PaymentMethod {
    protected String CardName;
    protected double balance;

    private String typeOfCard;

    CreditCardPayment() {

    }

    CreditCardPayment(double val, String cardName, String typeOfCard) {
        super(val);
        this.CardName = cardName;
        this.typeOfCard = typeOfCard;
    }

    @Override
    protected void paymentDetails() {
        System.out.println("Payment amount is: " + this.getAmount() + " by card " + this.CardName + "-" + this.typeOfCard);
    }
}
