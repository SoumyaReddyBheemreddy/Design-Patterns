package com.design.creational.abstract_factory;

public class SubBranch implements Branch{
    @Override
    public String getBranchName() {
        return "Sub-Branch";
    }

    @Override
    public boolean isLoanPermitted() {
        return false;
    }
}
