package com.deloitte.lab05.ex02;

public class NameValidator {
    public static void validateFullName(String firstName, String lastName) throws NameInvalidException {
        if (firstName == null || firstName.trim().isEmpty() || 
            lastName == null || lastName.trim().isEmpty()) {
            throw new NameInvalidException("First name and last name cannot be blank.");
        }
    }
}
