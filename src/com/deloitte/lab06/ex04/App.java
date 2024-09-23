package com.deloitte.lab06.ex04;
/*
 * Exercise 4: school offers medals to the students of tenth based on the following criteria 
If(Marks>=90) : Gold 
If(Marks between 80 and 90) : Silver 
If(Marks between 70 and 80) : Bronze 
Note: Marks between 80 and 90 means marks>=80 and marks<90 

Write a function which accepts the marks of students as a Hashmap and return 
the details of the students eligible for the medals along with type of medal. 
The input Hashmap contains the student registration number as key and mark as value. 
The output Hashmap should contain the student registration number as key and the medal type as value.
Method Name 	getStudents
Method Description 	Generate the list of students eligible for scholarship 
Argument 	Hashmap 
Return Type 	Hashmap 
Logic 	The method should return the details of the students eligible for the medals along with the medal type. 

 */

import java.util.HashMap;
import java.util.Map;

public class App {

    public static Map<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {
        Map<Integer, String> studentMedals = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            int marks = entry.getValue();
            int regNo = entry.getKey();

            if (marks >= 90) {
                studentMedals.put(regNo, "Gold");
            } else if (marks >= 80 && marks < 90) {
                studentMedals.put(regNo, "Silver");
            } else if (marks >= 70 && marks < 80) {
                studentMedals.put(regNo, "Bronze");
            }
        }

        return studentMedals;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(101, 95); 
        studentMarks.put(102, 88);  
        studentMarks.put(103, 76); 
        studentMarks.put(104, 65); 

        Map<Integer, String> medalResults = getStudents(studentMarks);
        System.out.println("Students and their medals: " + medalResults);
    }
}
