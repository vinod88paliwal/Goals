package com.oops.strings;

public class CountNumberOfWordsInString {


	public static void main(String[] args) {
		
		countNumberOfWords("My name is Vinod Paliwal");
		countNumberOfWords("I Love Java Programming");
		countNumberOfWords(" This	is  not   properly formatted		line ");
}

	private static void countNumberOfWords(String str) {
	
		//System.out.println(str.split(" ").length);  //won't work with tabs and multiple spaces
		
		String trimmedString = str.trim();
		int count = trimmedString.isEmpty() ? 0: trimmedString.split("\\s+").length;
		//The \\s is equivalent to [ \\t\\n\\x0B\\f\\r]
		System.out.println(count);
		
	}
	
}
