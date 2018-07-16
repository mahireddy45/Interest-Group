package com.test.arrays;

public class StringRotationEach {

	//string 2 is a substring of string when we concat string 1 to itself
	private static void checkRoation(String s1, String s2) {
		int s1Len = s1.length();
		int s2Len = s2.length();
		String temp = s1.concat(s1);
		
		//using java string methods
		//index will return the index of exists otherwise it will return -1
		if(s1Len == s2Len && temp.indexOf(s2) != -1)
			System.out.println("String2 "+s2+" is a substring of "+s1);
		else
			System.out.println("String2 "+s2+" is not a substring of "+s1);
		
	}
	
	public static void main(String[] args) {
		String s1 = "stackoverflow";
		String s2 = "overflowstack";
		checkRoation(s1, s2);
	}
	
}
