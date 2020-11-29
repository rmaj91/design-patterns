package com.rmaj91.creational.prototype;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public Animal copy() {
        return new Cat(this.name);
    }
}
