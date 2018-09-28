package com.oops.strings;

public class PermutationString {
//https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/	
	/**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
	private void permute(String str, int l, int r) {

			if(l  == r)
				System.out.println(str);
			else {
				  for(int i =l; i <=r ;i++) {
					  
					  str = swap(str,l,i);
					  permute(str, l+1, r);
					 // str = swap(str,l,i); //not required
				  }
			}
	}
	
	 /**
     * Swap Characters at position
     * @param a string value
     * @param l position 1
     * @param r position 2
     * @return swapped string
     */
	private String swap(String str, int l, int r) {
		char[] charArray = str.toCharArray();
		
		char temp = charArray[l];
		charArray[l] = charArray[r];
		charArray[r] = temp;
		
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		
		String str = "ABCD";   
		//Below are the permutations of string ABC.
		//ABC ACB BAC BCA CBA CAB
		
		
		int n = str.length();
		PermutationString obj = new PermutationString();
		obj.permute(str,0, n-1);
	}
}



