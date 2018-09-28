package com.oops.strings;

public class LongestPalindromeString {

	// Function to find longest Palindrome word
	private String longestPalindrome(String s) {

		 // to check last word for palindrome
			s +=" ";
		
		int len = 0, len1 = 0;

		// to store each word
		String longestword = "", word = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c != ' ') //character is not space so forming the word
				word += c;
			else {       //Character is space, means word has been formed in if() condition now play with that word.
				len = word.length();
				if (checkPalindrome(word, len) && len > len1) {
					len1 = len;
					longestword = word;
				}
				word = "";
			}
		}
		return longestword;
	}

	private boolean checkPalindrome(String word, int length) {
		word = word.toLowerCase();

		// loop to check palindrome
		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) != word.charAt(length-1-i))
				return false;
		}
		return true;
	}
	

	public static void main(String[] args) {

		LongestPalindromeString obj = new LongestPalindromeString();

		String s = "Madam Arora teaches Malayalam";

		if (obj.longestPalindrome(s) == "")
			System.out.println("No Palindrome Word");
		else
			System.out.println("LongestPalindrome Word : " + obj.longestPalindrome(s));

	}

}
