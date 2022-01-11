package com.design.creational.builder;

public class PhoneBuilder {
    private String os;
    private int ram;
    private int battery;
    public PhoneBuilder setOs(String os){
        this.os = os;
        return this;
    }
    public PhoneBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setBattery(int battery){
        this.battery=battery;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os,ram,battery);
    }
    @Override
    public String toString() {
        return "PhoneBuilder{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                '}';
    }

}
