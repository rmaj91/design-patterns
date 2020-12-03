package com.rmaj91.behavioral.visitor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        OriginalInterface object1 = new MyClass();
        OriginalInterface object2 = new MyClass2("12awd");
        ArrayList<OriginalInterface> myObjects = new ArrayList<>();
        myObjects.add(object1);
        myObjects.add(object2);
        for (OriginalInterface myObject : myObjects) {
            myObject.acceptVisitor(visitor);
        }
    }
}
