package com.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee{
    private int id;
    private  String name;
    private double salary;
    private List<Employee> subordinates;
    BankManager(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void printSubordinates() {
        System.out.println(this);
        for(Employee subordinate:subordinates){
            subordinate.printSubordinates();
        }
    }

    @Override
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public void remove(Employee employee) {
            subordinates.remove(employee);
    }

    @Override
    public String toString() {
        return "BankManager\n{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
