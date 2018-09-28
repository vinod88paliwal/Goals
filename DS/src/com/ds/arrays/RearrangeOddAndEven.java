package com.ds.arrays;
//https://www.geeksforgeeks.org/even-numbers-even-index-odd-numbers-odd-index/
public class RearrangeOddAndEven {

	public static void arrangeOddAndEven(int arr[], int n)
	{
	    int oddInd = 1;
	    int evenInd = 0;
	    while (true)
	    {
	        while (evenInd < n && arr[evenInd] % 2 == 0)
	            evenInd += 2;
	             
	        while (oddInd < n && arr[oddInd] % 2 == 1)
	            oddInd += 2;
	             
	        if (evenInd < n && oddInd < n)
	            {
	                int temp = arr[evenInd];
	                arr[evenInd] = arr[oddInd];
	                arr[oddInd] = temp;
	            }
	             
	        else
	            break;
	    }
	}
	
	public static void printArray(int arr[])
	{
	    for (int i : arr)
	        System.out.print(i + " ");
	}
	
	public static void main(String[] args) {

		int arr[] = { 3, 6, 12, 1, 5, 8 };
		int size = arr.length;
		
	    System.out.print("Original Array: ");
	    printArray(arr);
	 
	    arrangeOddAndEven(arr, size);
	 
	    System.out.print("\nModified Array: ");
	    printArray(arr);
	    
	}
}

//Time Complexity: O(n).
//Auxiliary Space: O(1).