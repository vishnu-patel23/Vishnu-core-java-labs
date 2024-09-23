package com.deloitte.lab02.ex03;


/*
 * Exercise 3: Create a method which accepts an integer array, 
 * reverse the numbers in the array and returns the resulting array in sorted order

 */

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] arr = {45,652,48,684,46,51,65,64,864,684,6,4,5135,48,631,86,1};
		System.out.println("Sorted reversed array: " + Arrays.toString(getSorted(arr)));
	}
	
	public static int[] getSorted(int[] arr) {
		//Return the resulting array after reversing the numbers and sorting it 
		int[] reversedArray = new int[arr.length];
		for (int i=0; i<arr.length;i++) {
			StringBuilder reversedString =new StringBuilder(String.valueOf(arr[i])).reverse();
			reversedArray[i]= Integer.parseInt(reversedString.toString());
		}
		Arrays.sort(reversedArray);
		
		return reversedArray;
		
	}

}