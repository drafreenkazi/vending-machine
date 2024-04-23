package com.techelevator;

public class Transaction {
    private String paymentMethod;
    private int differenceAmount;

    public Transaction(String paymentMethod, int differenceAmount, double moneyFeed, String message) {
        this.paymentMethod = paymentMethod;
        this.differenceAmount = differenceAmount;
        this.moneyFeed = moneyFeed;
        this.message = message;
    }

    public void addMoney(double addMoney) {
        this.moneyFeed = this.moneyFeed + addMoney;
    }
    public void subtractMoney(double subtractMoney) {
        this.moneyFeed = this.moneyFeed - subtractMoney;
    }

    public Transaction() {

    }

    public double getMoneyFeed() {
        return moneyFeed;
    }

    public void setMoneyFeed(double moneyFeed) {
        this.moneyFeed = moneyFeed;
    }

    private double moneyFeed;

    private String message;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getDifferenceAmount() {
        return differenceAmount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
