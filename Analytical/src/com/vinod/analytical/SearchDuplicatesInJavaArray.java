package com.vinod.analytical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SearchDuplicatesInJavaArray {

	public static void main(String[] args) {
	
		String[] withDuplicates = new String[] {"one","two","three","one"};
		
		String[] withDuplicatesNumbers = new String[] {"1","2","1","2","1"};
		
		Integer[] duplicatesNumbers = {3,2,5,1,2,4,3,2,5};
		
		//System.out.println(bruteforceAnyValue(duplicatesNumbers));
		//System.out.println(bruteforceAnyValue(withDuplicates));
		//System.out.println(bruteforceAnyValue(withDuplicatesNumbers));
		
		//duplicateValue(withDuplicatesNumbers);
		duplicateChars("sbagdfdsas");
		
		//System.out.println(bruteforce(withDuplicates));
		//System.out.println(bruteforce(withDuplicatesNumbers));
 }
	
	public static void duplicateChars(String input)
	{
		StringBuilder sb = new StringBuilder(input);
		
		String result="";
		
		while (sb.length() != 0) {
			
			int count=0;		
			char ch = sb.charAt(0);
				
			while (sb.indexOf(ch+"") != -1) {
			
				sb.deleteCharAt(sb.indexOf(ch+""));
				
				count++;
			}
			result = result+ch+count;
		}
	
		System.out.println(result);
	}
		
	public static void duplicateValue(Object[] input)
	{

		Map<String, Integer> dupMap = new HashMap<String, Integer>();
		
		 for (int i = 0; i < input.length; i++)
	     {
			 String str =  input[i].toString();
			 
			 if(dupMap.containsKey(str))
				 dupMap.put(str, dupMap.get(str)+1);
			 else
				 dupMap.put(str, 1);
	     }

		 Set<String> keys = dupMap.keySet();
		 
		 for(String s : keys){
		 int count = dupMap.get(s);

		 if(count >1)
				 System.out.println(s+" no of times: "+count);
	}

	}
	
	public static Set bruteforceAnyValue(Object[] input)
	{
			Set s = new HashSet();
			
		    for (int i = 0; i < input.length; i++)
		        {
		            for (int j = 0; j < input.length; j++) 
		            {
		                if (input[i].equals(input[j]) && i != j) 
		                {
		                    s.add(input[i]);
		                    
		                    System.out.println("i--> "+i+" j--> "+j);
		                	
		                }
		            }
		        }
		        return s;
	}
	
	public static Set<String> bruteforce(String[] input)
	{
		Set<String> s = new HashSet<String>();

		for (int i = 0; i < input.length; i++)
	        {
	            for (int j = 0; j < input.length; j++) 
	            {
	                if (input[i].equals(input[j]) && i != j) 
	                {
	                    s.add(input[i]);
	                    
	                    System.out.println("i--> "+i+" j--> "+j);
	                	
	                }
	            }
	        }
	        return s;
	  }
	  
	public static List<String> bruteforceByList(String[] input)
	{
	List<String> l = new ArrayList<String>();
		
	    for (int i = 0; i < input.length; i++)
	        {
	            for (int j = 0; j < input.length; j++) 
	            {
	                if (input[i].equals(input[j]) && i != j) 
	                {
	                    l.add(input[i]);
	                    
	                    System.out.println("i--> "+i+" j--> "+j);
	                	
	                }
	            }
	        }
	        return l;
	    }


}