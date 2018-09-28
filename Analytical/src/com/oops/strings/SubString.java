package com.oops.strings;

public class SubString {

	// Returns true if s2 is substring of s1
	static int isSubString(String s1, String s2)
	{
		int len1 = s1.length();
        int len2 = s2.length();
        
        /* A loop to slide pat[] one by one */
        for(int i=0 ; i<= len2 -len1 ; i++)
        {
        	int j;
        /* For current index i, check for pattern match */
        for( j=0; j< len1 ; j++)
        	if(s2.charAt(i + j) != s1.charAt(j))
        		break;
        	
           if (j == len1)
        		return i;
        }
        return -1;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("");
		
        String s1 = "for";
        String s2 = "geeksforgeeks";
        int res = isSubString(s1, s2);
        
        if(res == -1)
        	System.out.println("Not a sub String");
        else 
        	System.out.println("Sub String Present at Index : "+res);
	}
}
