package com.oops.strings;

public class ReverseWords {

	//Input=> "Hello World";
   //Output=> "World Hello";
	public static void main(String[] args) {

		String s = "Hello World Dear";

		reverseWordAndCharacters(s);
	}

	private static void reverseWordAndCharacters(String s) {

		char[] str = s.toCharArray();
		int len = str.length;
		int start = 0;

		for (int i = 0; i < len; i++) {

			if (str[i] == ' ' && i > 0) {

				reverse(str, start, i - 1);// Reverse characters of all words except last word. --> olleH dlroW Dear
				start = i + 1;
			} else if (i == len - 1)
				reverse(str, start, i);// Reverse characters of last word. -->  olleH dlroW raeD
		}//Loop ends here
		reverse(str, 0, len - 1); // Reverse characters of all words. --> Dear World Hello

		System.out.println("Reversed : " + new String(str));
	}

	private static void reverse(char[] str, int start, int end) {

		char tmp ;
		while (start < end) {

			 tmp = str[start];
			str[start] = str[end];
			str[end] = tmp;

			start++;
			end--;
		}

	}
}