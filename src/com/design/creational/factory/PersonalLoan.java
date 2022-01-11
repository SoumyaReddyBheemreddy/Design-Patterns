package com.design.creational.factory;

public class PersonalLoan implements Loan{
    double principle;
    double interest=10.4;

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
