package com.deloitte.lab02.ex04;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

/*
 * Exercise 4: Create a method which accepts an integer array and 
 * removes all the duplicates in the array. Return the resulting array in descending order
 */
public class App {
	public static void main(String[] args) {
		int [] arr = {2,6,5,4,4,45,755,12,22,22,15,15};
		System.out.println("Sorted Array: "+ Arrays.toString(modifyArray(arr)));
		
	}
	public static int[] modifyArray(int[]arr) {
		//Remove duplicates;
		Set<Integer> set = new TreeSet<>();
		
		for (int num:arr) 
			set.add(num);
		
		Integer[] uniqueArray = set.toArray(new Integer[0]);
		
		Arrays.sort(uniqueArray,Collections.reverseOrder());
		
		int[] aranged = new int[uniqueArray.length];
		for (int i=0;i<uniqueArray.length;i++)
			aranged[i]=uniqueArray[i];
		
		return aranged;
	}
}
