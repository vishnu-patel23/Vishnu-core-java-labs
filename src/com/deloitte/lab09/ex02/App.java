package com.deloitte.lab09.ex02;

/*
 * Exercise 2: Write a method that uses lambda expression to format a given string, 
 * where a space is inserted between each character of string.  
 * For ex., if input is “CG”, then expected output is “C G”.
 */


import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        Function<String, String> formatString = str -> String.join(" ", str.split(""));

        String input = "CG";
        String formattedString = formatString.apply(input);
        System.out.println("Formatted String: " + formattedString);
    }
}
