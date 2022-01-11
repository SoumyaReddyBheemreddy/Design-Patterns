package com.design.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Store implements Cloneable{
    private String storeName;
    List<Phone> phones = new ArrayList<>();

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
    public void loadData(){
        for(int i =1 ; i<=10;i++){
            Phone phone = new Phone();
            phone.setId(i);
            phone.setModelName("Model "+i);
            getPhones().add(phone);
        }
    }
//    shallow cloning
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected Store clone() throws CloneNotSupportedException {
        Store store = new Store();
        for (Phone phone:this.getPhones()){
            store.getPhones().add(phone);
        }
        return store;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", phones=" + phones +
                '}';
    }
}
