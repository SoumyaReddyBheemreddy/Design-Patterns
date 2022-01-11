package com.design.creational.factory;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args){
        GetLoanFactory loanFactory = new GetLoanFactory();
        System.out.println("Enter loan type");
        Scanner scanner = new Scanner(System.in);
        String loanType = scanner.nextLine();
        Loan loan = loanFactory.getLoan(loanType);
        System.out.println("Enter the amount required ");
        double amount = scanner.nextDouble();
        loan.setPrincipal(amount);
        System.out.println("Monthly Amount After Interest "+loan.getInterest()+" is :"+loan.getMonthlyAmountAfterInterest());

    }
}
