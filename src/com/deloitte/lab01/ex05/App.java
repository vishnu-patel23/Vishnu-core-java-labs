package com.deloitte.lab01.ex05;

/*
 * Exercise 5: Create a class with a method which can calculate 
 * the sum of first n natural numbers which are divisible by 3 or 5.
 */

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = calculateSum(n);
		System.out.println("sum of first "+ n+" natural numbers which are divisible by 3 or 5: "+sum);
	}
	public static int calculateSum(int num) { //Calculate Sum 
		int sum=0;
		for (int i=1; i<=num;i++) {
			if (i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		 
		return sum;
		
	}
}
