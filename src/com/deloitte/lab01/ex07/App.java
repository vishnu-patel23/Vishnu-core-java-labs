package com.deloitte.lab01.ex07;

/*
 * Create a method to check if a number is an increasing number
 */

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if (checkNumber(num)) {
			System.out.println("Number "+num+" is an increasing number.");
		}else
			System.out.println("Number "+num+" is not an increasing number.");
		
	}
	
	public static boolean checkNumber(int n) {
		int temp;
		while (n!=0) {
			temp= n%100;
		if (temp/10>temp%10) {
				return false;
			}
			n=n/10;
		}
		return true;
	}
}
