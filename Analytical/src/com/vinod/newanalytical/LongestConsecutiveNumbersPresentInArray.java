package com.vinod.newanalytical;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveNumbersPresentInArray {

	// Returns length of the longest consecutive subsequence
    static int findLongestConseqSubseq(int arr[],int n)
    {
    	Set<Integer> values = new HashSet<Integer>();
    	
    	for(int i : arr) {
    		values.add(i);
    	}
    	
    	int max =0;
    	
        // check each possible sequence from the start then update optimal length
    	for(int i : values) {
    		
    		if(values.contains(i -1)) continue;// Means.. if value already present then 

    		int len =0;
    		while (values.contains(i++)) len++;
    		
    		max = Math.max(max, len);
    	}
    	
    	return max;
    }
	
	public static void main(String[] args) {
	
		 int arr[] =  {1, 9, 3, 10, 4, 20, 2};
	     int n = arr.length;
	     System.out.println("Length of the Longest consecutive subsequence is "+ findLongestConseqSubseq(arr,n));
	                         
		
		
		

	}

}
