package com.rmaj91.behavioral.mediator.version2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Employee> participants = new ArrayList<>();

    @Override
    public void register(Employee employee) {
        participants.add(employee);
    }

    @Override
    public void sendMessage(Employee from, Employee to, String message) throws InterruptedException {
        if (from.employeeType().equalsIgnoreCase("Unauthorized")) {
            System.out.println("Unauthorized user tried to chat");
            from.receive(from, "you cannot send messages");
        } else if (participants.contains(from)) {
            to.receive(from, message);
        } else {
            from.receive(from, "target doesnot exists");
        }
    }

    public void displayParticipants() {
        participants.forEach(System.out::println);
    }
}
