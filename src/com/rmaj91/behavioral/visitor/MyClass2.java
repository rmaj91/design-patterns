package com.rmaj91.behavioral.visitor;

public class MyClass2 implements OriginalInterface{

    private String name;

    public MyClass2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit2(this);
    }
}
