package com.rmaj91.behavioral.visitor;

public interface Visitor {

    // or overloading
    void visit(MyClass myClass);
    void visit2(MyClass2 myClass);
}
