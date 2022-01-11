package com.design.creational.factory;

public class GetLoanFactory {
    public Loan getLoan(String loanType){
        if(loanType.equalsIgnoreCase("Home Loan"))
            return new HomeLoan();
        else if(loanType.equalsIgnoreCase("Car Loan"))
            return new CarLoan();
        else if(loanType.equalsIgnoreCase("Personal Loan"))
            return new PersonalLoan();
        return null;
    }
}
