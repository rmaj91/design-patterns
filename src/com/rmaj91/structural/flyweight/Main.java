package com.rmaj91.structural.flyweight;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car red1 = carFactory.create("red");
        Car red2 = carFactory.create("red");
        Car blue = carFactory.create("blue");
        System.out.println(red1 == red2);
        System.out.println(red1 == blue);
    }
}
