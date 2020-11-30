package com.rmaj91.structural.facade;

public class DbDriver {

    public void openConnection() {
        System.out.println("opening connection");
    }

    public void executeQuery(String query) {
        System.out.println("executing query");
    }

    public void closeConnection() {
        System.out.println("closing connection");
    }

    public String getResult() {
        System.out.println("getting result");
        return "result";
    }
}
