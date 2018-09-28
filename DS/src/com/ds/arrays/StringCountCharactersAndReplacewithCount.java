package com.ds.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCountCharactersAndReplacewithCount {

	public static void main(String[] args) {
		
		String s ="ABBBCCDDDDEEEEF"; //A3B2C3D4EF
		int len = s.length();
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		
		
		for(int i=0 ; i< len ; i++) {
			char c = s.charAt(i);
			
			if(dupMap.containsKey(s.charAt(i))) 
				dupMap.put(c, dupMap.get(c)+1);
			else
				dupMap.put(c,1);
		}
	
		StringBuffer sb = new StringBuffer();
		
		Set<Character> keys = dupMap.keySet();
		
		for(Character c : keys) {
			int count = dupMap.get(c);
			if(count >1) {
			
				sb.append(count);
				sb.append(c);
				continue;
			}
			sb.append(c);
		}
		  
		System.out.println(sb.toString());
		
	}
	
}
