package com.design.structural.composite;

interface Employee {
    public  int getId();
    public String getName();
    public double getSalary();
    public void printSubordinates();
    public void add(Employee employee) throws Exception;
    public void remove(Employee employee) throws Exception;
}
