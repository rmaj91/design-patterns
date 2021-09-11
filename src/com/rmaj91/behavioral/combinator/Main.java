package com.rmaj91.behavioral.combinator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("awdaw@wawp.pl", "+48 666-66-66", 11);
        Validator validator = new Validator();
        System.out.println(validator.validate(person));


        CombinatorValidator.ValidationResult result = CombinatorValidator.isAdult()
                .and(CombinatorValidator.isEmailValid())
                .and(CombinatorValidator.isPhoneValid())
                .apply(person);

        System.out.println(result);

    }
}
