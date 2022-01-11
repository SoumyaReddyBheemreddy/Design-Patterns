package com.design.creational.prototype;

public class Phone {
    private int id;
    private String modelName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
