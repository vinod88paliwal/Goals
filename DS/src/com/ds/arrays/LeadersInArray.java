package com.ds.arrays;
//https://www.geeksforgeeks.org/leaders-in-an-array/
public class LeadersInArray {

	static void printLeaders(int arr[], int size) 
	{
		int max_from_right = arr[size-1];
		
		/* Rightmost element is always leader */
        System.out.print(max_from_right + " ");
        
        for(int i = size-2; i>=0 ;i--)
        {
        	if(max_from_right < arr[i])
        	{
        		max_from_right = arr[i];
        		  System.out.print(max_from_right + " ");
        	}
        }
		
	}
	public static void main(String[] args) {

	        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
	        int n = arr.length;
	        printLeaders(arr, n);
	}

}
/*
Time Complexity: O(n)
Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. 
And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2. 
*/