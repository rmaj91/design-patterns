package com.rmaj91.behavioral.mediator.version1;

public class SeniorEmployee extends Employee {

    public SeniorEmployee(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public String employeeType() {
        return "senior employee";
    }
}
