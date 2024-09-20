package com.deloitte.lab01.ex01;

import java.util.Scanner;

// Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number

public class App {
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sum = SumOfCubes(num);
			
		System.out.println("Sum of cubes of digits is "+sum);
		
	}



	public static int SumOfCubes(int num){
		int sum=0, temp=0;
		while (num%10 != 0) {
				temp = num% 10;
				sum = sum+ (temp*temp*temp);
				num= num/10;
		}
		return sum;
	}

}