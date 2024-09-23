package com.deloitte.lab03.ex02;


/*
 * Exercise 2: Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol .

Method Name 
getImage
Method Description 
Generate the mirror image of a String and add it to the existing string. 
Argument 
String 
Return Type 
String 
Logic 
Accepts One String 
Find the mirror image of the String 
Add the two Strings together separated by a pipe(|) symbol. 
For Example 
Input : EARTH 
Output : EARTH|HTRAE 
Hint: Use StringBuffer API (Ex: For this problem reverse method in Stringbuffer can be used) 
Note: Learn the other APIs in StringBuffer


 */


public class App {
	public static void main(String[] args) {
		String str = "EARTH";
		System.out.println("String is:"+str); System.out.println("Output: "+ getImage(str));
	}
	
	public static String getImage(String str) {
	//Generate the mirror image of a String and add it to the existing string. 
		StringBuffer sb= new StringBuffer(str);
		String reversed = sb.reverse().toString();
		
		return str+"|"+reversed;
		
		
	}
}
