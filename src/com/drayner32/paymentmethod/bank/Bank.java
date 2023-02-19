package com.drayner32.paymentmethod.bank;

public class Bank {
    private double balance;
    private String bankName;
    ///private String typeOfCard;
    private double amount;

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return bankName;
    }

    public double getAmount() {
        return amount;
    }

//    public String getTypeOfCard() {
//        return typeOfCard;
//    }

    public Bank() {

    }

    public Bank(double balance, double amount, String bankName) {
        this.balance = balance;
        this.amount = amount;
        this.bankName = bankName;
        //this.typeOfCard = typeOfCard;
    }

    public void pay() {
        if (this.amount <= this.balance) {
            this.balance -= this.amount;
            System.out.println("Zapłacono " + this.amount + "$" + " kartą " + " " + this.bankName);
            System.out.println("Pozostało środków na koncie: " + this.balance);
        } else {
            System.out.println("Za mało środków na koncie");
        }
    }
}
