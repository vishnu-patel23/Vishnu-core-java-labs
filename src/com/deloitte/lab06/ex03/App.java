package com.deloitte.lab06.ex03;

/*
 * Exercise 3: Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap
Method Name	getSquares
Method Description	Accepts a list of numbers and return their squares
Argument	int[]
Return Type	Map
Logic	Iterate through the list, find the square of each
number and add the elements to a map object
with the number as the key and the square as the value

 */
import java.util.HashMap;
import java.util.Map;

public class App {

	public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squareMap = new HashMap<>();

        for (int number : numbers) {
            squareMap.put(number, number * number);
        }

        return squareMap;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6};

        Map<Integer, Integer> result = getSquares(numbers);
        System.out.println("Numbers and their squares: " + result);
    }
}

