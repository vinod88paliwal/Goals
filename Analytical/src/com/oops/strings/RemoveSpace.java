package com.oops.strings;

import java.util.Arrays;

public class RemoveSpace {

	
	public static void main(String[] args) {
		
		String str    = "  Hi there, how  are you   doing? ";
		char [] charArray = str.toCharArray();
		int len = charArray.length;
		int countSpaces=0; // number of spaces before 'i'th character
		
		for(int i=0; i < len  ; i++) {
			
			// countSpaces number of spaces
			if(charArray[i] == ' ')
				
				 countSpaces ++; 
			else
				 // put 'i'th character into its correct position after removing spaces before its
				 charArray[i-countSpaces] = charArray[i];
		}
		
		// all the spaces are moved towards the end of the string. 
        // Create new string by using non-space characters
		charArray = Arrays.copyOf(charArray, len - countSpaces);
		
		str = new String(charArray);
		System.out.println("String after spaces removed : "+str);
	}
}

/*
 Time Complexity is O(n)
 Space Complexity is O(n)
 
*/