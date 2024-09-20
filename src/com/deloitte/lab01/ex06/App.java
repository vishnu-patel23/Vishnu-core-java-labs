package com.deloitte.lab01.ex06;

import java.util.Scanner;

/*
 * Create a class with a method to find the difference between the sum of 
 * the squares and the square of the sum of the first n natural numbers.
 */
public class App {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		System.out.println("difference is :"+calculateDifference(n));
	}
	
	public static int calculateDifference(int n) {//Calculate the difference 
		int sum=0,sosq=0,sqos,numsum=0;
		for (int i=1;i<=n;i++) {
			sosq+= i*i;
			numsum+=i;
		}
		sqos= numsum*numsum;
		sum = sosq-sqos;
		
		return sum;
	}
	
}