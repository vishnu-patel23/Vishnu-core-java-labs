package com.deloitte.lab03.ex03;


/*
 * Exercise 3: Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
Note: Consonant refers to all alphabets excluding vowels

Method Name 	alterString
Method Description 	Replace consonants 
Argument 	String 
Return Type 	String 
Logic 	Return the String replacing all the consonants with the next character. 
For Example :JAVA should be changed as KAWA 

 */
public class App {
	public static void main(String[] args) {
		String str="JAva";
		System.out.println("Return String: "+ alterString(str));
		
	}
	
	private static boolean isvowel(char a ) {
		a=Character.toUpperCase(a);
		if (a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			return true;
		return false;
	}
	public static String alterString(String str) {
		char[] chara= str.toCharArray();
		System.out.println(chara);
		for (int i=0;i<chara.length;i++) {
			if (! isvowel(chara[i]))
				chara[i]=(char) (chara[i]+1);
		}
		
		return new String(chara);
	}
}
