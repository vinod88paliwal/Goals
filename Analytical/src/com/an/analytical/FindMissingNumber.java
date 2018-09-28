package com.an.analytical;
/*
* Class to find out the missing element from n-1 size array. Other way also is that n*(n+1)/5 give the sum and then sum the array numbers and difference
* is the missing number.
*/

public class FindMissingNumber {

	public static void main(String[] args)
    {
        int a[] = { 1, 2, 4, 6, 3, 7, 8 };
        
        int n = a.length + 1; //Adding 1 extra for missing no. 
        
        int mising = findMissing(a, n);
       
        System.out.println(mising);
    }

    private static int findMissing(int[] a, int n)
    {
        int x1 = a[0];
        int x2 = 1;
        
        for (int i = 1; i < a.length; i++)
            x1 ^= a[i];
        
        for (int i = 2; i <= n; i++)
            x2 ^= i;
        
        return (x1 ^ x2);
    }
}

/*
 
 X1 = A1 ^ A2 ^ A4
 X2 = A1 ^ A2 ^ A3 ^ A4
 
 X1 ^ X2 = (A1 ^ A2 ^ A4) ^ (A1 ^ A2 ^ A3 ^ A4)
 		= (A1 ^ A1)	^ (A2 ^ A2)	^ (A3)	^ (A4 ^ A4)	
 		=    0      ^    0      ^ A3    ^     0
 		= A3 
 
*/