package com.vinod.analytical;

import java.util.*;

public class DuplicateCharsInStringSimple {

	public static void main(String[] args) {
	
		String str = "Java2Neovioioioce";
		int arr[] = {3,2,5,3,7,8,4,8,3,4,5,6};
		
		DuplicateCharsInStringSimple.duplicateCharsInString(str);
		DuplicateCharsInStringSimple.duplicateNosInArray(arr);
	
	}
	
	static void duplicateCharsInString(String str) {
		
		ArrayList<Character> dupChars = new ArrayList<Character>();
		
		for (int i = 0; i < str.length() - 1; i++) {
			int count = 0;
			if (!dupChars.contains(str.charAt(i))) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}// Inner loop end
			}
			if (count > 1) {
				System.out.println(str.charAt(i) + " --- " + (count));
				dupChars.add(str.charAt(i));
			}
		}// Outer loop end
		
	}
	
	static void duplicateNosInArray(int[] arr) {
		
		ArrayList<Integer> dupChars = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			if (!dupChars.contains(arr[i])) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}// Inner loop end
			}
			if (count > 1) {
				System.out.println(arr[i] + " --- " + (count));
				dupChars.add(arr[i]);
			}
		}// Outer loop end
	}
}