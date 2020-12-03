package com.rmaj91.behavioral.memento;

public class ValueObject {
    private int value;

    public ValueObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
