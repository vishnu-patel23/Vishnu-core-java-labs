package com.deloitte.lab09.ex05;

/*
 * Exercise 5: Write a method to calculate factorial of a number. 
 * Test this method using method reference feature. 
 */


//Functional Interface
@FunctionalInterface
interface FactorialCalculator {
 int calculate(int n);
}

public class App {
	 public static void main(String[] args) {
	     FactorialCalculator calculator = App::factorial;
	     int number = 3;
	     int result = calculator.calculate(number);
	     System.out.println("Factorial of " + number + " is: " + result);
	 }

 // Method to calculate factorial of a number
 public static int factorial(int n) {
     if (n == 0 || n == 1) {
         return 1;
     }
     return n * factorial(n - 1);
 }

}
