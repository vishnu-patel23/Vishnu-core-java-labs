package com.deloitte.lab06.ex05;

/*
 * Exercise 5: Create a method which accepts an array of integer elements and 
 * return the second smallest element in the array

Method Name 		getSecondSmallest
Method Description 		Get the second smallest element in the array 
Argument 		int[] 
Return Type 		int
Logic 		Sort the array and return the second smallest element in the array Hint: 
1. Convert to Array List 2. Use sort method in Collections class 


 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	//Get the second smallest element in the array
    public static int getSecondSmallest(int[] arr) {
       List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);
        return list.get(1);
    }

    public static void main(String[] args) {
        int[] numbers = {12, 13, 11, 14, 10};
        int secondSmallest = getSecondSmallest(numbers);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
