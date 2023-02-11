public class PaymentMethod {

    protected double amount;

    public double getAmount() {
        return amount;
    }

//    public void setAmount(double amount) {
//        this.amount = amount;
//    }

    PaymentMethod() {

    }
    PaymentMethod(double value) {
        this.amount = value;
    }

    protected void paymentDetails() {
        System.out.println("Payment amount is: " + this.amount);
    }
}
