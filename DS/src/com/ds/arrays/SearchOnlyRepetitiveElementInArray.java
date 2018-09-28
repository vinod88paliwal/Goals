package com.ds.arrays;
//https://www.geeksforgeeks.org/find-repetitive-element-1-n-1/
public class SearchOnlyRepetitiveElementInArray {
/*
Algo (Use XOR): The idea is based on the fact that x ^ x = 0 and x ^ y = y ^ x.
1) Compute XOR of elements from 1 to n-1.
2) Compute XOR of array elements.
3) XOR of above two would be our result.

Time Complexity : O(n)
Auxiliary Space : O(1)
*/
 static int findRepeatingXOR(int arr[], int n)
  {
		// res is going to store value of 1 ^ 2 ^ 3 .. ^ (n-1) ^ arr[0] ^ arr[1] ^ .... arr[n-1]
		int resu =0;
		int x1=1;
		int x2 =arr[0];
		
		for (int i = 2; i <=n-1; i++)
            x1 ^= i;
		
		 for (int i = 1; i < n; i++)
			 x2 ^= arr[i];
		
		return (x1 ^ x2);
   }
 
/* 
Algo:  Using indexing.
1. Iterate through the array.
2. For every index visit a[index], if it is positive change the sign of element at a[index] index, else print the element.

Time Complexiy : O(n)
Auxiliary Space : O(1) 
 */
 // Function to find repeted element
 static int findRepeatingIndex(int arr[], int n)
 {
     int missingElement = 0;
  
     // indexing based
     for (int i = 0; i < n; i++){
  
         int element = arr[Math.abs(arr[i])];
  
         if(element < 0){
             missingElement = arr[i];
             break;
         }
      
         arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
     }
      return Math.abs(missingElement);
 }
	
     
	public static void main(String[] args) {
		
		// int arr[] = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
		  int arr[] = { 5, 4, 3, 9, 8, 9, 1, 6, 2, 5};
                 
	        int n = arr.length;
	        System.out.println(findRepeatingXOR(arr, n));
	        System.out.println(findRepeatingIndex(arr, n));
	}

}
