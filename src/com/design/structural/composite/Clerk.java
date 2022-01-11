package com.design.structural.composite;

import java.util.ArrayList;

public class Clerk implements Employee{
    private int id;
    private  String name;
    private double salary;

    public Clerk(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
    }

    @Override
    public void add(Employee employee) throws Exception {
        //this is leaf node so this method is not applicable to this class.
        throw new Exception("You can't add new employee");
    }

    @Override
    public void remove(Employee employee) throws Exception {
        //this is leaf node so this method is not applicable to this class.
        throw new Exception("You can't add new employee");
    }

    @Override
    public String toString() {
        return "Clerk\n{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
