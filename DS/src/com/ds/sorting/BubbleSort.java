package com.ds.sorting;

import java.util.Scanner;

public class BubbleSort {

/*
 How Bubble Sort Works?
Bubble sort sorts numbers by comparing the number and its following number. For example we will sort the entered 6 numbers in ascending way and here is the user's input.
2 5 3 4 1 6
The first number is 2 and the following number is 5. Is 2 < 5? if yes, proceed. The second comparison will be 5 and 3. Is 5 < 3? since the answer is no, it will sort the numbers in this way.
2 3 5 4 1 6	

Then, the next comparison is 5 and 4 and so on until it will be sorted properly from lowest to highest. Here is the complete list on how the numbers above sorted in bubble sort.
2 3 4 5 1 6
2 3 4 1 5 6
2 3 1 4 5 6
2 1 3 4 5 6
1 2 3 4 5 6 - end

Sample Output:
Enter the size of the array: 10
Enter 10 numbers: 100 35 45 3 7 2 1 500 200 15
The Sorted Numbers: 1 2 3 7 15 35 45 100 200 500 
http://aisha91.hubpages.com/hub/Java-Source-Code-How-to-Sort-Numbers-in-Bubble-Sort-Using-Recursion
 */
	
	public static void main(String[] args)
    {
 
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] x = new int[n];
 
        System.out.print("Enter "+ n +" numbers: ");
        for(int i=0; i<n; i++)
        {
            x[i] = input.nextInt();
        }
         
        BubbleSort access = new  BubbleSort();
    System.out.print("The Sorted numbers: ");
        access.bubbleSort(x);
    }
	
	public void bubbleSort(int[] arr){
	     for(int i=0; i<arr.length; i++){
	        for(int j=1; j<arr.length; j++){
	            if(arr[j-1]> arr[j] ){
	                int temp = arr[j];
	                arr[j] = arr[j-1];
	                arr[j-1] = temp;           
	            }
	        }
	     }
	 
	     for(int i=0; i<arr.length; i++)
	     {
	         System.out.print(arr[i] + " ");
	     }
	}
}
