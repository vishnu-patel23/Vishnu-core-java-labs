package com.deloitte.lab05.ex01;

public class AgeValidator {
    public static void validateAge(int age) throws AgeInvalidException {
        if (age <= 15) {
            throw new AgeInvalidException("Age must be above 15.");
        }
    }
}
