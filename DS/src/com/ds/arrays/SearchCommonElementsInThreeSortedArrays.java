package com.ds.arrays;
//https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/
public class SearchCommonElementsInThreeSortedArrays {

	static void findCommon(int ar1[], int ar2[], int ar3[])
    {
		 // Initialize starting indexes for ar1[], ar2[] and ar3[]
        int i = 0, j = 0, k = 0;
 
        // Iterate through three arrays while all arrays have elements
        while (i < ar1.length && j < ar2.length && k < ar3.length)
        {
             // If x = y and y = z, print any of them and move ahead
             // in all arrays
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
             {   System.out.print(ar1[i]+" ");   i++; j++; k++; }
 
             // x < y
             else if (ar1[i] < ar2[j])
                 i++;
 
             // y < z
             else if (ar2[j] < ar3[k])
                 j++;
 
             // We reach here when x > y and z < y, i.e., z is smallest
             else
                 k++;
        }
    }
	
	public static void main(String[] args) {
		 int ar1[] = {1, 5, 10, 20, 40, 80};
	        int ar2[] = {6, 7, 20, 80, 100};
	        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
	 
	        System.out.print("Common elements are ");
	        findCommon(ar1, ar2, ar3);
		
	}
}
//Time complexity :  O(n1 + n2 + n3)
/*
 Let the current element traversed in ar1[] be x, in ar2[] be y and in ar3[] be z. We can have following cases inside the loop.
1) If x, y and z are same, we can simply print any of them as common element and move ahead in all three arrays.


2) Else If x < y, we can move ahead in ar1[] as x cannot be a common element.

3) Else If y and y > z), we can simply move ahead in ar3[] as z cannot be a common element.

*/
