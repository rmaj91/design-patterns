package com.rmaj91.behavioral.mediator.version1;

public class Outsider extends Employee {

    public Outsider(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public String employeeType() {
        return "outsider";
    }
}
