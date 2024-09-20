package com.deloitte.lab01.ex03;

import java.util.Scanner;

/*
 * Exercise 3: The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. 
 * Every subsequent value is the sum of the 2 values preceding it. 
 * Write a Java program that uses both recursive and non-recursive functions to 
 * print the nth value of the Fibonacci sequence?

 */


public class App {
	public static void main(String[] args) {
		
		System.out.println("Enter Length of the Fibonacci sequence");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		nonrecursive(n);
		System.out.println(n+"th value of the Fibonacci sequence(Recursive): "+recursive(n));
	}
	
	public static int recursive(int n) {
		if (n<=1) 
			return n;
		else
		return recursive(n-1)+recursive(n-2);
	}
	
	public static void nonrecursive(int num){
		int n1=1,n2=1,nr_fib=0;
		
		for (int i=1;i<=num-2;i++) {
			nr_fib= n1+n2;
			n1= n2;
			n2= nr_fib;
		}
		System.out.println(num+"th value of the Fibonacci sequence: "+nr_fib);
	}
}
