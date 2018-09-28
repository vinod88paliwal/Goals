package com.oops.array;
public class ZeroAtEnd {

	/* Algo :
	moveZerosToEnd(arr, n)
	    Initialize count = 0
	    for i = 0 to n-1
	        if (arr[i] != 0) && (count != i) then
	            swap(arr[count++], arr[i]) 
	*/
    // function to move zero at the end
    private static void moveZerosToEnd(int[] a, int n) 
    {
           int temp;
           int count=0; // Count of non-zero elements
           
        	// Traverse the array. If arr[i] is non-zero, then swap the element at 
            // index 'count' with the element at  index 'i'
           for (int i = 0; i < n; i++) 
           {
        	   if(a[i] !=0 && count != i) {
        		   
        		   temp =a[i];
        		   a[i] = a[count];
        		   a[count] = temp;
        		   count++;
        	   }
           }
    }
    
 // Function which pushes all zeros to end of an array.
    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements
 
        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
                                       // incremented
 
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }
    
    public static void main(String args[]) {
    	
        //  int a[] = { 1, 0,1, 2, 1, 0, 3, 0, 0, 5 };

   	int a[] = {0, 1, 9, 8, 4, 0, 1, 2, 1, 0, 6, 0, 9};
          // calling the function to move the zero at end
   			moveZerosToEnd(a,a.length); 
   					//OR
   			//pushZerosToEnd(a,a.length);

          // displaying sorted array(zero at front)
          for (int i : a) {
                 System.out.print(i + " ");
          }
   }
}
//Time Complexity: O(n)
