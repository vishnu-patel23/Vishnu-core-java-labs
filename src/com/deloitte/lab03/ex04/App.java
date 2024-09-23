package com.deloitte.lab03.ex04;

/*
 * Exercise 4: Create a method that accepts a number and modifies it 
 * such that the each of the digit in the newly formed number is 
 * equal to the difference between two consecutive digits in the original number.
 *  The digit in the units place can be left as it is. 
Note: Take the absolute value of the difference. Ex: 6-8 = 2

Method Name 	modifyNumber
Method Description 	Accepts a number and modify it as per the requirement 
Argument 	int number1 
Return Type 	int
Logic 	Accept a number and modify it such that the each of the digit in the newly formed number 
is equal to the difference between two consecutive digits in the original number. 
For example. 
Input: 45862 
Output:13242 
Algorithm: 
• Convert number into String 
• Extract each char using charAt method 
• Convert char to int and find the difference 
• Create new StringBuffer object and keep adding the difference 
• Finally convert StringBuffer to int


 */
public class App {
	public static void main(String[] args) {
		int num = 45862;
		System.out.println("Number "+num+"\nModified Number: "+modifyNumber(num));
	}
	
	public static int modifyNumber(int num1 ) {
		String str = Integer.toString(num1);
		StringBuffer replaced = new StringBuffer();
		for (int i=0;i<str.length()-1;i++) {
			int current = Character.getNumericValue(str.charAt(i));
			int next= Character.getNumericValue(str.charAt(i+1));
			int diff = Math.abs(next-current);
			replaced.append(diff);
		}
		replaced.append(str.charAt(str.length()-1));
		return Integer.parseInt(new String(replaced));
	}
}
