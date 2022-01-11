package com.design.creational.factory;

public interface Loan {
    public double getPrincipal();
    public void setPrincipal(double amount);
    public double getMonthlyAmountAfterInterest();
    public double getInterest();

}
