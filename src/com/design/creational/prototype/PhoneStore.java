package com.design.creational.prototype;

public class PhoneStore {
    public static void main(String[] args) throws CloneNotSupportedException{
        Store store = new Store();
        store.setStoreName("Happi");
        store.loadData();
        Store store1 =store.clone();
        store1.setStoreName("Pi");
        store.getPhones().remove(2);
        System.out.println(store);
        System.out.println(store1);
    }
}
