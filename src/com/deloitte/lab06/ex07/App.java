package com.deloitte.lab06.ex07;

/*
 * Exercise 7: Create a method which accepts an integer array, 
 * reverse the numbers in the array and returns the resulting array in sorted order

Method Name 	getSorted
Method Description 	Return the resulting array after reversing the numbers and sorting it 
Argument 	int [] 
Return Type 	int
Logic 	Accept and integer array, reverse the numbers in the array, sort it and return the resulting array. 
Hint 
1. Convert the numbers to String to reverse it 
2. Use Collection APIs to sort it 


 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    // Method to reverse numbers and return the sorted array
    public static int[] getSorted(int[] arr) {
        List<Integer> reversedList = new ArrayList<>();

        for (int num : arr) {
            String reversedString = new StringBuilder(String.valueOf(num)).reverse().toString();

            reversedList.add(Integer.parseInt(reversedString));
        }
        Collections.sort(reversedList);
        int[] sortedArray = new int[reversedList.size()];
        for (int i = 0; i < reversedList.size(); i++) {
            sortedArray[i] = reversedList.get(i);
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] numbers = {123, 456, 789, 321};

        int[] sortedReversedArray = getSorted(numbers);
        System.out.println("Sorted Reversed Array:");
        for (int num : sortedReversedArray) {
            System.out.print(num + " ");
        }
    }
}
