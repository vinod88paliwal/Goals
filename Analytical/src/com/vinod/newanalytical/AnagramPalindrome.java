package com.vinod.newanalytical;

public class AnagramPalindrome {
	
	public static void main(String[] args) {
		
		String s = "ABCDCBA";
		int len = s.length();
		
		System.out.println("Can palindrome be formed from '" + s + "' ? : " + canMakeAPalindrome(s));
	}
	
	private static boolean canMakeAPalindrome(String s) {
		int[] arr = new int[256];
		char[] charArray = s.toCharArray();
		int oddCharCount = 0;
		
		for (char ch : charArray)
			arr[ch]++;
		

		for (int ch : arr) {

			// Count characters with odd occurrence.
			if (ch % 2 != 0)
				oddCharCount++;

			// If more than one character in the string has odd occurrence then
			// palindrome cannot be formed from given string
			if (oddCharCount > 1)
				return false;
		}

		return true;
	}

	private static int[] createFrequencyArray(String testStr) {
		int[] frequencyArr = new int[256];

		char[] charArray = testStr.toCharArray();

		for (char ch : charArray)
			frequencyArr[ch]++;

		return frequencyArr;
	}

}
