package com.rmaj91.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

    private Map<String, Car> cache = new HashMap<>();
    private final String commonEngine = "engine";

    Car create(String color) {
        return cache.computeIfAbsent(color, newColor-> {
            Car car = new Car();
            car.setColor(newColor);
            car.setEngine(commonEngine);
            return car;
        });
    }
}
