package com.ds.arrays;

public class SearchPositionOfElementInsortedArrayOfInfiniteNumbers {

	 private static int binarySearch(  final int[] array,int start,int end, final int value) {

	        // Loop until the range is zero.
	        while (start <= end) {
	       
	            // Find the mid-point in the range.
	            int middle = (start + end) / 2;

	            // If the value is found at the
	            // mid-point, return it.
	            if (array[middle] == value)
	                return middle;

	            // Otherwise, cut the range in half
	            // before looping.
	            if (array[middle] < value)
	                start = middle + 1;
	            else
	                end = middle - 1;
	        }

	        // Return -1 to indicate the
	        // element was not found.
	        return -1;
	    }
	 
	static int findPos(int arr[],int key)    
    {
		int i=0;
		while (true) {
			
			if(arr[i] == key)
			  return i;
			  
			else if(key > arr[i])
			i++;
			else
				break;
		}
		// at this point we have updated low and high indices, thus use binary search between them
		return binarySearch(arr, i/2, i, key);
    }
	
	public static void main(String[] args) {
		
		//int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		int []arr={2,8,10,12,14,18,20,22};
		int ans = findPos(arr,10);
		
		if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
	}
}

/*
 Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array.
If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.

Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
->if it is greater than high index element then copy high index in low index and double the high index.
->if it is smaller, then apply binary search on high and low indices found.
 */
