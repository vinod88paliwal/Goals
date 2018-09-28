package com.vinod.newanalytical;

import java.util.HashSet;
import java.util.Set;
/* Example : 
Input: arr[] = {1, 9, 3, 10, 4, 20, 2};
Output: 4
The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements


Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
Output: 5
The subsequence 36, 35, 33, 34, 32 is the longest subsequence of consecutive elements. 
*/
public class LongestConsecutiveNumbersPresentInArray {

	// Returns length of the longest consecutive subsequence
    static int findLongestConseqSubseq(int arr[],int n)
    {
    	Set<Integer> values = new HashSet<Integer>();
    	
    	for(int i : arr) {
    		values.add(i);
    	}
    	
    	int maxLen =0;
    	
        // check each possible sequence from the start then update optimal length
    	for(int i : values) {
    		
    		// if current element is the starting element of a sequence
    		if(values.contains(i -1)) continue;// Previous of current is present means current is not the starting element so continue to next traversal and check for starting element.

    		int len =0;
    		while (values.contains(i++)) len++; //Now keep checking Consecutive next Number in the set
    		
    		maxLen = Math.max(maxLen, len); 
    	}
    	
    	return maxLen;
    }
	
	public static void main(String[] args) {
	
		 int arr[] =  {1, 9, 3, 10, 4, 20, 2};
	     int n = arr.length;
	     System.out.println("Length of the Longest consecutive subsequence is "+ findLongestConseqSubseq(arr,n));
	}
}
