package com.rmaj91.behavioral.memento;

public class Memento {

    private ValueObject valueObject;

    public Memento(ValueObject valueObject) {
        this.valueObject = valueObject;
    }

    public ValueObject getValueObject() {
        return valueObject;
    }
}
