package com.rmaj91.behavioral.mediator.version2;

public abstract class Employee {

    protected Mediator mediator;
    protected String name;
    protected boolean authorizedUser;

    public Employee(Mediator mediator, String name, boolean register) {
        this.mediator = mediator;
        this.name = name;
        this.authorizedUser = register;
        if (register) {
            mediator.register(this);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void sendMessage(Employee toFriend, String message) throws InterruptedException {
        mediator.sendMessage(this, toFriend, message);
    }

    public void receive(Employee fromFriend, String message) {
        System.out.println(this.name + " received a message : " + message + " from an employee " + fromFriend.getName() + ".");
    }

    public abstract String employeeType();
}
