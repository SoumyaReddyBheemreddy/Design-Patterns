package com.design.creational.abstract_factory;

public class FactoryCreator {
    public static BankAbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Branch")){
            return new BranchFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}
