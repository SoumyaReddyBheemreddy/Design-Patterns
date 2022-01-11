package com.design.creational.factory;

public class HomeLoan implements Loan{
    double principle;
    double interest=7.2;

    @Override
    public double getPrincipal() {
        return principle;
    }

    @Override
    public void setPrincipal(double amount) {
            this.principle=amount;
    }

    @Override
    public double getMonthlyAmountAfterInterest() {
        return principle*(interest/100);
    }

    @Override
    public double getInterest() {
        return interest;
    }
}
