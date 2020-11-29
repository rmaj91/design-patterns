package com.rmaj91.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog adam = new Dog("Adam");
        Dog clone = adam.clone();
        System.out.println(clone.getName());
    }
}
