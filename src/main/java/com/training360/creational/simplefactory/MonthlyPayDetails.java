package com.training360.creational.simplefactory;

public class MonthlyPayDetails implements PayDetails{
    private double amount;

    public MonthlyPayDetails(double amount) {
        this.amount = amount;
    }

    @Override
    public double pay() {
        return amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
