package com.design.creational.singleton.eager_initialization;

class Main{
    public static void main(String[] args){
        ConfigManager configManager1 = ConfigManager.getInstance();
        ConfigManager configManager2 = ConfigManager.getInstance();
        configManager1.get("host");
        configManager2.get("host");
        configManager1.update("host","new host");
        configManager2.get("host");
    }
}