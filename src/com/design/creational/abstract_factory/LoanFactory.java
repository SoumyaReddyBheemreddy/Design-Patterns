package com.design.creational.abstract_factory;

public class LoanFactory implements BankAbstractFactory {

    @Override
    public Branch getBranch(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType){
        if(loanType.equalsIgnoreCase("Home Loan"))
            return new HomeLoan();
        else if(loanType.equalsIgnoreCase("Car Loan"))
            return new CarLoan();

        return null;
    }
}
