package com.vinod.newanalytical;

public class NumberOfSubstringsFromString {

 int countNonEmptySubstr(String s) {
	 
	 int n = s.length();
	 return n*(n+1)/2  ;
 }
	
 public static void main(String[] args) {
		
		NumberOfSubstringsFromString obj = new NumberOfSubstringsFromString();

		System.out.println(obj.countNonEmptySubstr("abcd"));
		
/*
input : str = “abc”
Output : 6
Proper substrings are “a”, “b”, “c”, “ab”, “bc”, “abc”

Input : str = “abcd”
Output : 10
Proper substrings are “a”, “b”, “c”, “d”, “ab”, “bc”, “cd”, “abc”, “bcd” and “abcd”
 		
*/
		
	}
}



/*
#Count of non-empty substrings is n*(n+1)/2
If we include empty string also as substring, the count becomes n*(n+1)/2 + 1
 
How does above formula work?

    Number of substrings of length one is n (We can choose any of the n characters)
    Number of substrings of length two is n-1 (We can choose any of the n-1 pairs formed by adjacent)
    Number of substrings of length three is n-2 (We can choose any of the n-2 triplets formed by adjacent)
    In general, Number of substrings of length k is n-k+1 where 1 <= k <= n

Total number of substrings of all lengths from 1 to n 
	= n + (n-1) + (n-2) + (n-3) + … 2 + 1
	= n * (n + 1)/2 
 */
	

