package com.design.creational.abstract_factory;

interface Loan {
    public double getInterestRate();
    public void calculateLoanPayment(double loanAmount, int years);
}