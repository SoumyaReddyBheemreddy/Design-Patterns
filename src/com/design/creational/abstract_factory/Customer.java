package com.design.creational.abstract_factory;


import java.util.Scanner;

public class Customer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BankAbstractFactory branchBankAbstractFactory = FactoryCreator.getFactory("Branch");
        BankAbstractFactory loanBankAbstractFactory = FactoryCreator.getFactory("Loan");
        System.out.print("\nEnter the branch name: \n");
        String branchName = scanner.nextLine();
        System.out.print("\nEnter the type of loan : \n");
        String loanType = scanner.nextLine();
        Branch branch = branchBankAbstractFactory.getBranch(branchName);
        if(branch.isLoanPermitted()) {
            Loan loan = loanBankAbstractFactory.getLoan(loanType);
            System.out.print("\nEnter the loan amount:\n");
            double amount = scanner.nextDouble();
            System.out.print("\nEnter the number of years to pay: \n");
            int years = scanner.nextInt();
            loan.calculateLoanPayment(amount, years);
        }
        else {
            System.out.println("Sorry, loan is not permitted for this branch");
        }

    }
}
