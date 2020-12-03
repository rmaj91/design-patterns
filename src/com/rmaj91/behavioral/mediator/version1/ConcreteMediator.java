package com.rmaj91.behavioral.mediator.version1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Employee> participants = new ArrayList<>();

    @Override
    public void register(Employee employee) {
        participants.add(employee);
    }

    @Override
    public void sendMessage(Employee employee, String message) throws InterruptedException {
        if (participants.contains(employee)) {
            System.out.println(employee.getName() + " posts: " + message + " Last message posted at " + LocalDateTime.now());
            Thread.sleep(1000);
        } else {
            System.out.println(employee.getName() + " not registered.");
        }

    }

    public void displayParticipants() {
        participants.forEach(System.out::println);
    }
}
