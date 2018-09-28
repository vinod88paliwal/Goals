package com.ds.arrays;
//https://www.geeksforgeeks.org/search-insert-and-delete-in-an-unsorted-array/
public class SearchInsertDeleteInUnsortedArray {

	 static int findElement(int arr[], int n, int key)
	 {
		 	for(int i =0; i< n ;i++) 
		 	{
		 		if(arr[i] == key)
		 			return i;
		 	}
		 	return -1;
	 }
	 
	 static int insertSorted(int arr[], int n, int key, int capacity)
	 {
		// Cannot insert more elements if n is already more than or equal to capcity
		 if(n >= capacity)
			 return n;
	 
		 arr[n] =key;
		 return (n+1);
	 }
            
	
	public static void main(String[] args) {

		 int a[] = {12, 34, 10, 6, 40};
	        int n = a.length;
	      
	        // Using a last element as search element
	        int key = 40;
	        int position = findElement(a, n, key);
	      
	        if (position == - 1)
	            System.out.println("Element not found");
	        else
	            System.out.println("Element Found at Position: " + (position + 1));
	 
	        			/**********Insert *********/     
	        int[] arr = new int[20]; 
	        arr[0] = 12;  arr[1] = 16;  arr[2] = 20; arr[3] = 40;  arr[4] = 50;  arr[5] = 70;
	       
	        int capacity = 20;
	        int size = 6;
	        int i, k = 26;
	        System.out.print("Before Insertion: ");
	        for(int val : arr)
	        	System.out.print(val+" ");
	        
	     // Inserting key
	        n = insertSorted(arr, n, key, capacity);
	        
	        System.out.print("\n After Insertion: ");
	        for(int val : arr)
	        	System.out.print(val+" ");
	        
	}

}
