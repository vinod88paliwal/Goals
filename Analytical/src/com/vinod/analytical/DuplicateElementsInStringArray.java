package com.vinod.analytical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Best way
public class DuplicateElementsInStringArray {

	static void duplicateCharsInString(String str) {

		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		//char[] chrs = str.toCharArray();
		//for (Character ch : chrs) {
					//or
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != 32) { // Removing space count
				if (dupMap.get(ch) != null) {
					dupMap.put(ch, dupMap.get(ch) + 1);
				} else {
					dupMap.put(ch, 1);
				}
			}
		}
			
		Set<Character> keys = dupMap.keySet();
		for (Character ch : keys) {
				//or
		//for (char ch : keys) {
			
			int count = dupMap.get(ch);
			
			//if (count > 1) {
				System.out.println(ch + "--->" + count);
		//	}
		}
	}

	
	static void duplicateNosInArray(int[] arr) {

		Map<Integer, Integer> dupMap = new HashMap<Integer, Integer>();

		for (Integer no : arr)
		{
		 if(dupMap.get(no) != null)
			 dupMap.put(no, dupMap.get(no) + 1);
		 else
			dupMap.put(no, 1);
		}
		Set<Integer> keys = dupMap.keySet();
		for (Integer ch : keys) {
				//or
		//for (char ch : keys) {
			
			int count = dupMap.get(ch);
			
			//if (count > 1) {
				System.out.println(ch + "--->" + count);
		//	}
		}
	}
	
	public static void main(String a[]) {
		duplicateCharsInString("Java2Nifddaoveice with this program");
		
		int arr[] = {3,2,5,3,7,8,4,8,3,4,5,6};
		duplicateNosInArray(arr);
	}

}
