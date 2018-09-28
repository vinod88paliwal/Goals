package com.oops.strings;

public class DeleteConsecutiveSameWordsInASequence {
	
	// This function recursively removes duplicates and returns modified string
	
	public static void main(String[] args) 
	{
		DeleteConsecutiveSameWordsInASequence obj =  new DeleteConsecutiveSameWordsInASequence();
		String str = "jaaaaaavvvvvaaa";
		
		String res ="";
		int i=0 ;
		
		for( ; i<str.length()-1 ; i++) {
		
		char c1 = str.charAt(i);	
		char c2 = str.charAt(i+1);
			
			if(c1 != c2 )
				res +=c1;
			
		}
		res += str.charAt(i); //To apend the last character of the String.	
		
		System.out.println("Word after removing repeated characters = "+res); // Printing the result
	}
}

/*
 Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, ab bcd ab is the new sequence.

Input :  tom jerry jerry tom
Output : 0
As first both jerry will destroy each other.
Then sequence will be tom, tom they will also destroy each other. So, the final sequence doesn't contain any word.
 */
