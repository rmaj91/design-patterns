package com.rmaj91.behavioral.mediator.version1;

public class JuniorEmployee extends Employee {

    public JuniorEmployee(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public String employeeType() {
        return "junior Employee";
    }
}
