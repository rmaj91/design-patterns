package com.rmaj91.behavioral.memento;

public class Caretaker {

    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject(14);
        Originator originator = new Originator(valueObject);
        originator.setValueObject(new ValueObject(18));
        Memento memento = originator.createMemento();
        originator.setValueObject(new ValueObject(12));

        originator.loadState(memento);

        System.out.println(originator.getValueObject().getValue());
    }
}
