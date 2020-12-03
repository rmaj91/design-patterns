package com.rmaj91.behavioral.mediator.version1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Mediator mediator = new ConcreteMediator();
        Employee juniorEmployee = new JuniorEmployee(mediator, "Janusz");
        Employee seniorEmployee = new SeniorEmployee(mediator, "Grazyna");
        Employee outsider = new Outsider(mediator, "Mieczywslaw");

        mediator.register(juniorEmployee);
        mediator.register(seniorEmployee);

        juniorEmployee.sendMessage("message1");
        seniorEmployee.sendMessage("message2");
        outsider.sendMessage("message3");
    }
}
