package com.deloitte.lab06.ex01;

/*
 * Exercise 1: Create a method which accepts a hash map and return the values of the map in sorted order as a List.

Method Name 	getValues
Method Description 	Get the values of a map in sorted order 
Argument 	HashMap
Return Type 	List 
Logic 	Return the values of a hash map in sorted order 

 */
import java.util.*;

public class App{

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 3);
        map.put("C", 8);
        map.put("D", 1);

        List<Object> sortedValues = getValues(map);
        System.out.println("Sorted Values: " + sortedValues);
    }

    public static List<Object> getValues(HashMap<String, Object> map) {
        Collection<Object> values = map.values();
        

        List<Object> valueList = new ArrayList<>(values);
        
        Collections.sort(valueList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                // Handle different types (if necessary)
                if (o1 instanceof Comparable && o2 instanceof Comparable) {
                    return ((Comparable<Object>) o1).compareTo(o2);
                }
                return 0;
            }
        });

        return valueList;
    }


}
