package com.oops.strings;

public class SubSequence {

	public static void main(String[] args) {
		
		String s1 ="today is monday";
		String s2 =  "timn";

		int len1 = s1.length();
		int len2 = s2.length();	

		int j=0;
		
		for(int i=0; i<len1 && j<len2 ; i++) {
			
			if(s1.charAt(i) == s2.charAt(j))
				j++;
		}
		
		// If all characters of str2 were found in str1
		if(j == len2)
			System.out.println("Found!!!");
		else 
			System.out.println("Not Found!!!");
		
	}
	
}
