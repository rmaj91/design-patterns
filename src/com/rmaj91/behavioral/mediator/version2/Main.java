package com.rmaj91.behavioral.mediator.version2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Mediator mediator = new ConcreteMediator();
        Employee janusz = new ConcreteEmployee(mediator, "Janusz", true);
        Employee antek = new ConcreteEmployee(mediator, "Antek", true);
        Employee milosz = new ConcreteEmployee(mediator, "Milosz", false);
        Employee grazyna = new Outsider(mediator, "Grazyna");

        janusz.sendMessage(grazyna, "wiadomosc");
        antek.sendMessage(antek, "wiadomosc");
        janusz.sendMessage(milosz, "wiadomosc");
        grazyna.sendMessage(janusz, "wiadomosc");
    }
}
