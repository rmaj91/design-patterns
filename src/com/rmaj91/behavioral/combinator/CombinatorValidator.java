package com.rmaj91.behavioral.combinator;

import java.util.function.Function;

public interface CombinatorValidator extends Function<Person, CombinatorValidator.ValidationResult> {

    static CombinatorValidator isEmailValid() {
        System.out.println("email validation...");
        return person -> person.email().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CombinatorValidator isPhoneValid() {
        System.out.println("phone validation...");
        return person -> person.phoneNumber().startsWith("+48") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CombinatorValidator isAdult() {
        System.out.println("adult validation...");
        return person -> person.age() >= 18 ? ValidationResult.SUCCESS : ValidationResult.NOT_AN_ADULT;
    }

    default CombinatorValidator and(CombinatorValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return ValidationResult.SUCCESS.equals(result) ? other.apply(customer) : result;
        };
    }
    enum ValidationResult {
        SUCCESS,
        EMAIL_NOT_VALID,
        PHONE_NUMBER_NOT_VALID,
        NOT_AN_ADULT
    }

}
