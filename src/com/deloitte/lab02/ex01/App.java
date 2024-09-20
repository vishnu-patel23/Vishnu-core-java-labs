package com.deloitte.lab02.ex01;


import java.util.Arrays;

/*
 * Exercise 1: Create a method which accepts an array of 
 * integer elements and return the second smallest element in the array
 */
public class App {
	public static void main(String[] args) {
		int[] myArray= {3,8,6,1,2,3,0,20,3,5,9};
		int secondnum= secondSmallest(myArray);
		System.out.println(secondnum);
		
		
	}
	
	public static int secondSmallest(int[] arr) { //Get the second smallest element in the array
		if (arr ==null || arr.length<2) {
			System.out.println("Array size too small");
		}
		
		Arrays.sort(arr);
		
		return arr[1];
		
	}

}
