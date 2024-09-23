package com.deloitte.lab09.ex03;

/*
 * Exercise 3: Write a method that uses lambda expression to accept username and password and return true or false. 
 * (Hint: Use any custom values for username and password for authentication)
 */


import java.util.function.BiPredicate;

public class App {

    public static void main(String[] args) {
        final String validUsername = "admin";
        final String validPassword = "password";

        BiPredicate<String, String> authenticate = (username, password) -> 
                username.equals(validUsername) && password.equals(validPassword);

        String usernameInput = "admin";
        String passwordInput = "password";

        boolean isAuthenticated = authenticate.test(usernameInput, passwordInput);
        System.out.println("Authentication successful: " + isAuthenticated);
    }
}
