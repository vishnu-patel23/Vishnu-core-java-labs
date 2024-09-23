package com.deloitte.lab03.ex08;
/*
 * Exercise 8: Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right each character 
 * in the String comes after the previous characters in the Alphabetical order. 
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.
 */

public class App {

    public static void main(String[] args) {
        String [] testString = {"ANT","Bee","Be","CAT","Fire","A","ABcd"};

        for (String str:testString)
        	System.out.println(str + " is positive: " + isPositiveString(str));
        }

    public static boolean isPositiveString(String input) {
        if (input == null || input.length() < 2) {
            return true; 
            }
        
        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);
            
            if (currentChar >= nextChar) {
                return false;
            }
        }
        return true;
    }
}
