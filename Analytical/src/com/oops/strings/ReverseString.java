package com.oops.strings;

public class ReverseString {

	public static void main(String[] args) {
		String    reverseStr = reverseRecursively("Vinod Paliwal Bangalore");
        System.out.println("Reverse String using Recursion: " + reverseStr);

	}

	//Using Recursion
    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) 
            return str;
        
        return reverseRecursively(  str.substring(1) )   + str.charAt(0);

    }
}
