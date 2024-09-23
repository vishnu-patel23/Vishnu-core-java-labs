package com.deloitte.lab03.ex05;

/*
 * 
Exercise 5: Write a Java program that displays the number of characters, lines and words in a text?
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your text (Type 'exit' to finish):");
        
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.equalsIgnoreCase("exit")) {
                break;
            }            
            lineCount++;
            characterCount += line.length();
            StringTokenizer tokenizer = new StringTokenizer(line);
            wordCount += tokenizer.countTokens();
        }
        
        scanner.close();
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}

