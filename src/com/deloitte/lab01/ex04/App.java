package com.deloitte.lab01.ex04;



/*
 * Exercise 4: Write a Java program that prompts the user for an integer
 *  and then prints out all the prime numbers up to that Integer?
 */

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	
		System.out.println("Enter a number:");
		Scanner	sc= new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("All the prime numbers till "+ num );
		for (int i = 2; i <= num; i++) 
            if (isPrime(i)) {
                System.out.print(i + " "); 
            }
	}

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  
            }
        }
        return true;  
    }

}



