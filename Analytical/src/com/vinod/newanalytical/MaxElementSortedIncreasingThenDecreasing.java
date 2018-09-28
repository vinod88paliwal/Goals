package com.vinod.newanalytical;
/* Example : 
 Input: arr[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1}
Output: 500

Input: arr[] = {1, 3, 50, 10, 9, 7, 6}
Output: 50

Corner case (No decreasing part)
Input: arr[] = {10, 20, 30, 40, 50}
Output: 50

Corner case (No increasing part)
Input: arr[] = {120, 100, 80, 20, 0}
Output: 120
 */
//https://www.geeksforgeeks.org/find-the-maximum-element-in-an-array-which-is-first-increasing-and-then-decreasing/
/*  (Binary Search) :
 We can modify the standard Binary Search algorithm for the given type of arrays.
i) If the mid element is greater than both of its adjacent elements, then mid is the maximum.
ii) If mid element is greater than its next element and smaller than the previous element then maximum lies on left side of mid. Example array: {3, 50, 10, 9, 7, 6}
iii) If mid element is smaller than its next element and greater than the previous element then maximum lies on right side of mid. Example array: {2, 4, 6, 8, 10, 3, 1} 
 */
//Note :  This method works only for distinct numbers. For example, it will not work for an array like {0, 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 5, 3, 3, 2, 2, 1, 1}. 
public class MaxElementSortedIncreasingThenDecreasing {

	// function to find the 
    // maximum element
    static int findMaximum(int arr[], int low, int high)
    {
       /* Base Case: Only one element is  present in arr[low..high]*/
       if (low == high)
         return arr[low];
      
       /* If there are two elements and  first is greater then the first  element is maximum */
       if ((high == low + 1) && arr[low] >= arr[high])
          return arr[low];
      
       /* If there are two elements and  second is greater then the second element is maximum */
       if ((high == low + 1) && arr[low] < arr[high])
          return arr[high];
         
       /*low + (high - low)/2;*/
       int mid = (low + high)/2;   
      
       /* If we reach a point where arr[mid] is greater than both of its adjacent 
          elements arr[mid-1] and arr[mid+1], then arr[mid] is the maximum element*/
       if ( arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
          return arr[mid];
      
       /* If arr[mid] is greater than the next element and smaller than the previous element then maximum lies on left side of mid */
       if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1])
         return findMaximum(arr, low, mid-1);
       else
         return findMaximum(arr, mid + 1, high);
    }
	
	public static void main(String[] args) {
		
		//int arr[] = {1, 3, 50, 10, 9, 7, 6};
		//int arr[] = {10, 300, 50, 100, 9, 7, 6}; // Failse
		int arr[] = {8, 10, 20, 80, 5,33,5,45,100, 200, 400, 500, 3, 2, 1};
		
		//int arr[] = {8, 10, 20, 80, 5,33,5,45,100, 200, 400, 500, 3, 2, 1};
		
        int n = arr.length;
        System.out.println("The maximum element is "+   findMaximum(arr, 0, n-1));
	}
}
//Time Complexity : O(Logn)