package com.deloitte.lab06.ex02;

/*
 * Exercise2 Collection: Create a method that accepts a character array and 
 * count the number of times each character is present in the array.

Note: Complete this exercise in Eclipse.[Eclipse-Lab3_4]

Method Name 	countChars
Method Description 	method that accepts a character array and count 
the number of times each character is present in the array.
Argument 	char[] arr
Return Type 	Map<Character, Integer>
Logic 	

 */
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'a', 'd', 'b', 'a'};
         Map<Character, Integer> characterCounts = countChars(charArray);
         System.out.println("Character counts: " + characterCounts);
     }
    
    
	public static Map<Character, Integer> countChars(char[] arr) {
	//method that accepts a character array and count 
	//the number of times each character is present in the array.
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : arr) {

            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }


}
