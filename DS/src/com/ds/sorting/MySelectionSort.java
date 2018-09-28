package com.ds.sorting;

public class MySelectionSort {

	public static int[] doSelectionSort(int[] arr){
			//5,1,12,-5,16,2,12,14        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            
            printNumbers(arr);
        }
        return arr;
    }
	
	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}
     
    public static void main(String a[]){
         
//        int[] arr1 = {10,34,2,56,7,67,88,42};
    	
    	int[] arr1 = {5,1,12,-5,16,2,12,14};
    	
    	 printNumbers(arr1);
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
