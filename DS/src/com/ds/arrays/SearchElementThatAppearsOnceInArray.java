package com.ds.arrays;
//https://www.geeksforgeeks.org/find-element-appears-array-every-element-appears-twice/
//https://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/


public class SearchElementThatAppearsOnceInArray {
//Question : Find the element that appears once in an array where every other element appears twice
	// Return the maximum Sum of difference between consecutive elements.
    static int findSingle(int ar[], int ar_size)
    {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];
     
        return res;
    }
	
//Question : Find the Number Occurring Odd Number of Times
   static int getOddOccurrence(int ar[], int ar_size) 
    {
        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++) 
        {
            res = res ^ ar[i];
        }
        return res;
    }
    
	public static void main(String[] args) {
		
		 int arr[] = {2, 3, 5, 4, 5, 3, 4};
	     int n = arr.length;
	     System.out.println("Element occurring once is " + findSingle(arr, n) + " ");
	     
	     int a[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
	     int size = a.length;
	     
	     System.out.println("Odd occurance of element : "+getOddOccurrence(a, size));
//Both question can be solved with same solution.	     
	}
}

/*
Time complexity : O(n) and it requires O(1) extra space.

The best solution is to use XOR. XOR of all array elements gives us the number with single occurrence. The idea is based on following two facts.
a) XOR of a number with itself is 0.
b) XOR of a number with 0 is number itself.

Example : 
res = 7 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4

Since XOR is associative and commutative, above expression can be written as:
res = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)  
    = 7 ^ 0 ^ 0 ^ 0
    = 7 ^ 0
    = 7 

*/