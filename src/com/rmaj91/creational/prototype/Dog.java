package com.rmaj91.creational.prototype;

public class Dog implements Cloneable {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    protected Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }

    public String getName() {
        return name;
    }
}
