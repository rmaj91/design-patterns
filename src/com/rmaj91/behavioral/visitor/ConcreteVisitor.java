package com.rmaj91.behavioral.visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(MyClass myClass) {
        System.out.println(myClass.getMyInt());
    }

    @Override
    public void visit2(MyClass2 myClass) {
        System.out.println(myClass.getName());
    }
}
