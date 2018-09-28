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
public class MaxElementIncreasingThenDecreasing {

	// function to find the 
    // maximum element
    static int findMaximum(int arr[], int low, int high)
    {
       /* Base Case: Only one element is  present in arr[low..high]*/
       if (low == high)
         return arr[low];
      
     /*   If there are two elements and  first is greater then the first  element is maximum 
       if ((high == low + 1) && arr[low] > arr[high])
          return arr[low];
      
        If there are two elements and  second is greater then the second element is maximum 
        if ((high == low + 1) && arr[low] < arr[high])
          return arr[high];*/
       
       		//OR - can be written as below 
         if(high == low +1)
           return Math.max(arr[low], arr[high]);
       
       /*low + (high - low)/2;*/  //It is mainly used to avoid overflow. Consider an example where the data type of the low and high is integer. So integer has an upper range of 65535 if it is an unsigned integer. Now consider the value of low as 1000 and high as 65000. Now if you calculate mid as (low + high)/2, it will give you a wrong result due to overflow of integer data type. Now if you calculate mid as low + ( high -low )/2 , it will give you a correct result. So to avoid overflow second way is way better than first method of calculating mid. I hope you got my point.
       int mid = (low + high)/2;   
      
       /* If we reach a point where arr[mid] is greater than both of its adjacent 
          elements arr[mid-1] and arr[mid+1], then arr[mid] is the maximum element*/
       if ( arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
          return arr[mid];
      
       /* If arr[mid] is greater than the next element and smaller than the previous element then maximum lies on left side of mid */
      // {1, 3, 50, 10, 9, 7, 6}, here; Mid (10) ,means our mid is in decreasing side and its is bigger than its next element then 100% that max element would be present its previous/left side.
       if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1])
         return findMaximum(arr, low, mid-1);
       else
         return findMaximum(arr, mid + 1, high);
    }
	
	public static void main(String[] args) {
		
		//int arr[] = {1, 3, 50, 10, 9, 7, 6};
		//int arr[] = {10, 300, 50, 100, 9, 7, 6}; // Failse
		int arr[] = {8, 10, 20, 80, 5,33,5,45,100, 200, 400, 500, 3, 2, 1};
		
		//int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; //
		
		//int arr[] = {8, 10, 20, 80, 5,33,5,45,100, 200, 400, 500, 3, 2, 1};
		
        int n = arr.length;
        System.out.println("The maximum element is "+   findMaximum(arr, 0, n-1));
	}
}
//Time Complexity : O(Logn)