package com.rmaj91.behavioral.mediator.version2;

public class ConcreteEmployee extends Employee {

    public ConcreteEmployee(Mediator mediator, String name, boolean register) {
        super(mediator, name, register);
    }

    @Override
    public String employeeType() {
        return "Employee";
    }
}
