package com.design.structural.composite;

public class Main {
    public static void main(String[] args) throws Exception {
        Employee bankManager = new BankManager(101,"Kumar",50000.0);
        Employee loanOfficer = new LoanOfficer(201,"Krish",40000.0);
        Employee cashier = new Cashier(301,"Raj",35000.0);
        Employee clerk1 = new Clerk(401,"Sam",20000.0);
        Employee clerk2 = new Clerk(402,"Das",20000.0);
        bankManager.add(cashier);
        bankManager.add(loanOfficer);
        cashier.add(clerk1);
        cashier.add(clerk2);
        bankManager.printSubordinates();
    }
}
