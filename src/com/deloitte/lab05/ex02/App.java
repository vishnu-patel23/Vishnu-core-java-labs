package com.deloitte.lab05.ex02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        scanner.close();
        try {
            NameValidator.validateFullName(firstName, lastName);
            System.out.println("Full name is valid: " + firstName + " " + lastName);
        } catch (NameInvalidException e) {
            System.out.println("Invalid name: " + e.getMessage());
        }
    }
}
