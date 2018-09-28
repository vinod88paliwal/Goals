package com.vinod.newanalytical;

//This function returns k'th smallest element in arr[l..r]
// using QuickSort based method. ASSUMPTION: ALL ELEMENTS IN ARR[] ARE DISTINCT
public class NthSmallestNumber {
	
private	static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];

	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      } 
	      
	      return i;
	}
	
private	static void quickSort(int arr[], int left, int right) {

	      int index = partition(arr, left, right);
	     
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      else if (index < right)
	            quickSort(arr, index, right);
	}
	
	public static int kthSmallest(int[] arr, int left, int right, int k) {
		
		quickSort(arr, left, right); //3 4 5 7 12 19 26
		
		return arr[k];
	}
	
	public static void main(String[] args) {

		//int arr[] = new int[]{12, 3, 5, 7, 4, 19, 26};
		int arr[] = { 12, 3, 5, 7, 4, 19, 26 };
          int len = arr.length - 1;
          int k = 1;
          
        System.out.println((k-1)+ "K'th smallest element is : " + kthSmallest(arr, 0, len, k-1) );
        
        System.out.println(6+"K'th hieghest element is : " +  kthSmallest(arr, 0, len, 6) );
        
	}
	

}
