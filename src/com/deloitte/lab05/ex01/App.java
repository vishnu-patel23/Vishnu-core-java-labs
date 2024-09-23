package com.deloitte.lab05.ex01;

/*
Exercise 1:  Validate the age of a person and display proper message by using user defined exception. 
Age of a person should be above 15.
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        
        try {
            AgeValidator.validateAge(age);
            System.out.println("Age is valid.");
        } catch (AgeInvalidException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }
}
