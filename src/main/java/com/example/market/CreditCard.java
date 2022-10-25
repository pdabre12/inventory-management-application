package com.example.market;



public class CreditCard {
    private String cardNumber;


    public CreditCard(String cardNumber){
        this.cardNumber=cardNumber;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String toString() {
        return "Credit Card :name=" + this.cardNumber;
    }
}
