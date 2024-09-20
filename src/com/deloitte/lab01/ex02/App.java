package com.deloitte.lab01.ex02;

import java.util.Scanner;

/**
 * Exercise 2: Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green with int inputs. 
 * On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear 
 * in the console. 
 */

public class App {

	public static void main(String[] args) {
		System.out.println("Enter your choice(Numbers only) 1.Red 2. Yellow 3. Green.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		TrafficLights(num);
	}
	
	
	public static void TrafficLights(int num) {
		switch(num) {
		case(1): System.out.println("stop");
				break;
		case(2): System.out.println("ready");
		break;
		case(3): System.out.println("go");
		break;
		default: System.out.println("Inappropriate choice");
		break;
		
		}
		
	}
}
