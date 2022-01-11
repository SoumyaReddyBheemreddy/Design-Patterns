package com.design.creational.builder;

public class Store {
    public static void main(String[] args){
        //Phone phone = new Phone("Android",64,6000);
        Phone phone = new PhoneBuilder()
                .setRam(32)
                .setOs("Android")
                .getPhone();
        System.out.println(phone);
    }
}
