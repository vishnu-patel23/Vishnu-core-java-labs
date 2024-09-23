package com.deloitte.lab03.ex09;

/*
 * Exercise 9: Create a method to accept date and print the duration in 
 * days, months and years with regards to current system date.
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void printDuration(String inputDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(inputDate, formatter);
        
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(startDate, currentDate);
        
        System.out.println("Duration from " + startDate + " to " + currentDate + ":");
        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        printDuration(inputDate);
        scanner.close();
    }
}
