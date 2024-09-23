package com.deloitte.lab06.ex06;

/*
 * Exercise 6: Create a method which accepts the id and the age of people as a Map 
 * and decide if they are eligible for vote. A person is eligible for vote 
 * if his age is greater than 18. Add the IDs of all the eligible persons to list and return the list. 

Method Name 	votersList
Method Description 	Generate the list of voters based on the ages of the people 
Argument 	Map 
Return Type 	List 
Logic 	Accept a map with ID as key and Date of Birth as value and check if the person is eligible to vote. A person is eligible for vote for if his age is greater than 18. If the person is eligible add his ID to the list. 

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Map<Integer, Integer> people = new HashMap<>();
        people.put(101, 20);  // Eligible
        people.put(102, 17);  // Not eligible
        people.put(103, 22);  // Eligible
        people.put(104, 16);  // Not eligible

        List<Integer> eligibleVoters = votersList(people);

         System.out.println("Eligible Voter IDs: " + eligibleVoters);
    }
    
    
    // Generate the list of voters based on the ages of the people 
    public static List<Integer> votersList(Map<Integer, Integer> people) {
        List<Integer> eligibleVoters = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : people.entrySet()) {
            int id = entry.getKey();
            int age = entry.getValue();

            if (age > 18) {
                eligibleVoters.add(id);
            }
        }

        return eligibleVoters;
    }

}

