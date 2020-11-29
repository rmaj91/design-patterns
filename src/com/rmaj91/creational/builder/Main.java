package com.rmaj91.creational.builder;

import com.rmaj91.creational.builder.builderPattern.*;
import com.rmaj91.creational.builder.lombokBuilder.LombokBuilder;

public class Main {
    public static void main(String[] args) {
        // LombokBuilder
        LombokBuilder lombokBuilder = LombokBuilder.builder()
                .name1("awd")
                .name2("ADW")
                .name3("Adw")
                .build();
        // BuilderPattern
        Director director = new Director();

        Builder car = new Car("Fiat");
        Builder motorCycle = new MotorCycle("Honda");

        director.construct(car);
        director.construct(motorCycle);

        Product carProduct = car.getProduct();
        Product motorCycleProduct = motorCycle.getProduct();

        System.out.println("car: " + carProduct);
        System.out.println("motorCycle: " + motorCycleProduct);
    }
}
