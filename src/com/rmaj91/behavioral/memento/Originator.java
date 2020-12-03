package com.rmaj91.behavioral.memento;

public class Originator {

    private ValueObject valueObject;

    public Originator(ValueObject valueObject) {
        this.valueObject = valueObject;
    }

    public ValueObject getValueObject() {
        return valueObject;
    }

    public Memento createMemento() {
        ValueObject deepCopy = new ValueObject(this.valueObject.getValue());
        return new Memento(deepCopy);
    }

    public void loadState(Memento memento) {
        valueObject = memento.getValueObject();
    }

    public void setValueObject(ValueObject valueObject) {
        this.valueObject = valueObject;
    }
}
