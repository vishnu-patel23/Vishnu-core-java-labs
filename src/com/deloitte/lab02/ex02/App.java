package com.deloitte.lab02.ex02;


/*
 * Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order. 
 * The elements in the left half should be completely in uppercase and the elements in the right half 
 * should be completely in lower case. Return the resulting array.
Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE

 */

import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		String[] str = {"ant","grass","food","rock","rocket"};
		System.out.println(Arrays.toString(sortStrings(str)));
		
		
		
	}
	public static String[] sortStrings(String[] str){//accept an array of String objects and sort in Alphabetical order.
		if(str==null || str.length<1) {
			System.out.println("String size too small");
		}
		Arrays.sort(str,String.CASE_INSENSITIVE_ORDER);
		int mid =(str.length%2 ==0)?(str.length/2):((str.length/2) +1);
		for (int i=0; i<mid;i++) {
			str[i]=str[i].toUpperCase();
		}

		for (int i=mid;i<str.length;i++) {
			str[i]=str[i].toLowerCase();
		};
		return str;
	}
}
