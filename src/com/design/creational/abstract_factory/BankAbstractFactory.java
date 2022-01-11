package com.design.creational.abstract_factory;
//Abstract Factory
interface BankAbstractFactory {
    public Branch getBranch(String bank);
    public Loan getLoan(String loan);
}
