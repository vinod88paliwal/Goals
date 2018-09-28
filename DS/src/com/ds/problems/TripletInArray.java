package com.ds.problems;

import java.util.Arrays;

/**
 * Created by vpaliwal on 9/9/17.
 */
public class TripletInArray {

    //Assuming array is sorted, if not then first please sort before using the logic of findTriplet() method
    static void findTriplet(int[] arr, int size, int sum) 
    {

        int l_indx, r_indx , tripletSum;

         for(int indx =0; indx < size-2 ; indx++)
         {
             l_indx = indx+1;  r_indx = size-1;

             while (l_indx < r_indx)
             {
                tripletSum = arr[indx] + arr[l_indx] +arr[r_indx] ;
                if(tripletSum == sum){
                    System.out.println("Triplet is "+arr[indx] +" "+ arr[l_indx]+" " +arr[r_indx]);
                }
                 if (tripletSum < sum)
                     l_indx ++;
                 else
                     r_indx --;
             }
         }
     }
//Time Complexity: O(n2) 
//Auxiliary Space: O(1)
    
//https://www.geeksforgeeks.org/maximum-triplet-sum-array/  
    static void maxTriplet(int[] arr, int size) 
    {
    	int first = arr[0];
		int second = arr[1];
		int third = arr[2];
		
		for(int i : arr) {
			if(i > first) {
				third =second;
				second = first;
				first = i;
			}
			else if( i> second && i != first) { 
				third =second;
				second =i;
			}
			else if (i> third && i != first && i != second)
				third = i;
		}
	System.out.println("Max Triplet: "+(first+second+third)+" Combination of "+first+", "+second+" ,"+third);
    }
//Time complexity : O(n)
//Space complexity : O(1)
    
    static void tripletSumZero(int[] arr, int size) 
    {
        int l_indx, r_indx , tripletSum;
      
         for(int indx =0; indx < size-2 ; indx++)
         {
             l_indx = indx+1;    r_indx = size-1;

             while (l_indx < r_indx)
             {
                tripletSum = arr[indx] + arr[l_indx] +arr[r_indx] ;
                if(tripletSum == 0){
                    System.out.println("Triplet having sum zero :-->  "+arr[indx] +" "+ arr[l_indx]+" " +arr[r_indx]);
                }
                 if (tripletSum < 0)
                     l_indx ++;
                 else
                     r_indx --;
             }
         }
     }
//Time Complexity : O(n2)
//Space complexity : O(1)    
    
//https://www.geeksforgeeks.org/find-triplet-sum-two-equals-third-element/  
    static void tripletSumOfTwoEuqalsThirdElement(int[] arr, int size) 
    {
    	int l_indx=0, r_indx=0 ;
    	
    	// sort the array
        Arrays.sort(arr);
        int indx;
        
    	 for(indx=0 ; indx < size-1 ; indx++)
    	 {
    		 l_indx = indx+1;    r_indx = size-1;
    		 
    		 while (l_indx < r_indx)
             {
                if(arr[indx]  == (arr[l_indx] +arr[r_indx]))
                {
                    System.out.println("Numbers are :-->  "+arr[indx] +" "+ arr[l_indx]+" " +arr[r_indx]);
                    return;
                }
                else if(arr[indx]  < (arr[l_indx] + arr[r_indx]))
                     l_indx ++;
                 else
                     r_indx --;
             }
    	 }
    	 System.out.println("Numbers111 are :-->  "+arr[indx] +" "+ arr[l_indx]+" " +arr[r_indx]);
    }
    
 public static void main(String[] args) {
        int arr[] = {0,3,5,7,9,44};
        int size = arr.length;
      //  findTriplet(arr, size,17);
        //maxTriplet(arr, size);
        
        int a[] = {0, -1, 2, -3, 1};
      //  tripletSumZero(a, a.length);
        
        int []arr1 = {5, 32, 1, 7, 10, 50, 19, 21, 2};
        
        tripletSumOfTwoEuqalsThirdElement(arr1,arr1.length);
    }
}