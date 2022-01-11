package com.design.creational.abstract_factory;

public class HomeLoan implements Loan {
    protected double interest = 5.0;
    private double EMI;
    @Override
    public double getInterestRate() {
        return interest;
    }
    @Override
    public void calculateLoanPayment(double loanAmount, int years)
    {
        int months;
        months=years*12;
        interest=interest/100;
        EMI=((interest*Math.pow((1+interest),months))/((Math.pow((1+interest),months))-1))*loanAmount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount "+loanAmount+" you have borrowed");
    }

}
