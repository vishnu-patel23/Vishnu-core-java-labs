package com.deloitte.lab03.ex01;

/*
 * Exercise 1: Write a Java program that reads a line of integers 
 * and then displays each integer and the sum of all integers. 
 * (Use String Tokenizer class)?
 */


import java.util.StringTokenizer;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Enter a few integers separated by space:");
		Scanner sc = new Scanner(System.in); 
		String input = sc.nextLine();
		sc.close();
		StringTokenizer tokens = new StringTokenizer(input," ");
		int sum =0;
		System.out.println("Integers are: ");
		while (tokens.hasMoreTokens()) {
			int n =Integer.parseInt(tokens.nextToken());
			System.out.println(n);
			sum += n;
		}
		System.out.println("Sum is: "+ sum);
	}
}
