package com.rmaj91.behavioral.mediator.version1;

public abstract class Employee {

    protected Mediator mediator;
    protected String name;

    public Employee(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void sendMessage(String message) throws InterruptedException {
        mediator.sendMessage(this, message);
    }

    public abstract String employeeType();
}
