package com.vinod.newanalytical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatingElement {
	public static void main(String[] args) {
		
		NonRepeatingElement obj = new NonRepeatingElement();
		
		int arr[] = { 9, 4, 9, 6, 7, 4, 5, 9 };
		
		Map<Integer, Integer> dupMap = new HashMap<>();
		
		for( int n : arr) {
			if(dupMap.get(n) != null)
				dupMap.put(n, dupMap.get(n)+1);
			else
				dupMap.put(n,1);
			}	
	
		Set<Integer> keySet = dupMap.keySet();
		
		System.out.println("Non Repeating Elements : ");
		
		for(int n : keySet) {
		
			if(dupMap.get(n) == 1)
				System.out.print(n+"    ");
		}
	}
}

/*
1) Traverse array and insert elements and their counts in hash table.
2) Traverse array again and print first element with count equals to 1. 

Time Complexity : O(n)
Auxiliary Space : O(n)
 
*/
