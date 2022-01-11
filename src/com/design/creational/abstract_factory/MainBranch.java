package com.design.creational.abstract_factory;

public class MainBranch implements Branch{
    @Override
    public String getBranchName() {
        return "Main Branch";
    }

    @Override
    public boolean isLoanPermitted() {
        return true;
    }
}
