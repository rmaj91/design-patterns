package com.rmaj91.structural.bridge;

public class Main {

    public static void main(String[] args) {
        Color color = new Blue();
        Shape shape = new Square(color);
        shape.draw();
    }
}
