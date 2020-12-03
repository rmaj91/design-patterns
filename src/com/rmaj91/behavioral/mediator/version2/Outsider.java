package com.rmaj91.behavioral.mediator.version2;

public class Outsider extends Employee {

    public Outsider(Mediator mediator, String name) {
        super(mediator, name, false);
    }

    @Override
    public String employeeType() {
        return "Unauthorized";
    }
}
