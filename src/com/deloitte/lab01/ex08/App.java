package com.deloitte.lab01.ex08;

import java.util.Scanner;

/*
 * Exercise 8: Create a method to check if a number is a power of two or not
 */
public class App {
	
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (checkNumber(n))
			System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");
	}
	
	public static boolean checkNumber(int n) {
		if (n<=0)
			return false;
		while (n>1) {
			if (n%2!=0)
				return false;
			n/=2;
		}return true;
	}

}
