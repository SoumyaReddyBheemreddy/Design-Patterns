package com.design.creational.abstract_factory;


public class BranchFactory implements BankAbstractFactory {

    @Override
    public Branch getBranch(String branch) {
        if(branch.equalsIgnoreCase("Main Branch"))
            return new MainBranch();
        else if(branch.equalsIgnoreCase("Sub Branch"))
            return new SubBranch();
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
