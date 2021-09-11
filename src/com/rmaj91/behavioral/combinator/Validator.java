package com.rmaj91.behavioral.combinator;

public class Validator {

    static boolean isEmailValid(Person person) {
        return person.email().contains("@");
    }

    static boolean isPhoneValid(Person person) {
        return person.phoneNumber().startsWith("+48");
    }

    static boolean isAdult(Person person) {
        return person.age() > 18;
    }

    public boolean validate(Person person) {
        return isAdult(person) && isEmailValid(person) && isPhoneValid(person);
    }
}
