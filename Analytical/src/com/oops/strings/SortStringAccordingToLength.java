package com.oops.strings;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringAccordingToLength {

	// Function to Sort the array of string according to lengths. This function implements Insertion Sort. 
	void sort(String s[], int n)
	{
	    for (int i=1 ;i<n; i++)
	    {
	        String temp = s[i];
	 
	        // Insert s[j] at its correct position
	        int j = i - 1;
	        while (j >= 0 && temp.length() < s[j].length())
	        {
	            s[j+1] = s[j];
	            j--;
	        }
	        s[j+1] = temp;
	    }
	}
	
	public static void main(String[] args) {
		
		SortStringAccordingToLength obj = new SortStringAccordingToLength();
		
		String s = "Hello Java World What do you want";
		
		String str[] = s.split(" ");
		
	/*	Arrays.sort(str, (x,y) -> Integer.compare(x.length(), y.length()) );
	 */
			// OR
		   // User defined logic
		obj.sort(str, str.length);
		
		
		for(String st : str) {
			System.out.print(st+" ");
		}
	}
}
