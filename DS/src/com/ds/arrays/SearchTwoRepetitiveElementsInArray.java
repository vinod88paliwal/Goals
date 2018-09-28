package com.ds.arrays;
//https://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/
//Note : this method will work only if Max element in the array is less than the size of the array.

//Best Solution : com.vinod.analytical.DuplicateElementsInStringArray
public class SearchTwoRepetitiveElementsInArray {

	static  void printRepeating(int arr[], int size)
	{
        System.out.println("The repeating elements are : ");
        
        for(int i=0 ; i< size; i++)
        {
        	if(arr[Math.abs(arr[i])] > 0 )
        		arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        	else
        		System.out.print(Math.abs(arr[i])+" ");
        }
	}
	public static void main(String[] args) {

		int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int size = arr.length;
        printRepeating(arr, size);
        
	}

}
/*
Algo :
Traverse the array. Do following for every index i of A[].
{
check for sign of A[abs(A[i])] ;
if positive then
   make it negative by   A[abs(A[i])]=-A[abs(A[i])];
else  // i.e., A[abs(A[i])] is negative
   this   element (ith element of list) is a repetition
}

Example: A[] =  {1, 1, 2, 3, 2}
i=0; 
Check sign of A[abs(A[0])] which is A[1].  A[1] is positive, so make it negative. 
Array now becomes {1, -1, 2, 3, 2}

i=1; 
Check sign of A[abs(A[1])] which is A[1].  A[1] is negative, so A[1] is a repetition.

i=2; 
Check sign of A[abs(A[2])] which is A[2].  A[2] is  positive, so make it negative. '
Array now becomes {1, -1, -2, 3, 2}

i=3; 
Check sign of A[abs(A[3])] which is A[3].  A[3] is  positive, so make it negative. 
Array now becomes {1, -1, -2, -3, 2}

i=4; 
Check sign of A[abs(A[4])] which is A[2].  A[2] is negative, so A[4] is a repetition.
*/