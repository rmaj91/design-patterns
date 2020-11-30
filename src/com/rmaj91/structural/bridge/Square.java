package com.rmaj91.structural.bridge;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println(color.fill());
    }

    public Square(Color color) {
        super(color);
    }
}
