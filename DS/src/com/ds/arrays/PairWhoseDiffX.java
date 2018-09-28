package com.ds.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/count-pairs-difference-equal-k/
public class PairWhoseDiffX {

	private static final int MAX = 100000; // Max size of Hashmap
	
	static int  printpairs(int arr[],int k)
    {
		int count = 0;  // Initialize count
		int size = arr.length;
		 // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];

     // Insert array elements to hashmap
        for(int i=0; i<size; i++)
        	 binmap[arr[i]] = true;
        
        for(int i=0; i<size; i++)
        {
        	 int temp = arr[i]- k;
        	
        	 if (temp  >= 0 && binmap[temp])
        	 {
        		 System.out.println("Pair with given diff " + k + " is (" + arr[i] + ", "+temp+")");
        		 count++;
        	 }
                
        	  temp = arr[i]+ k;
             if (temp  < MAX && binmap[temp])
             {
        		 System.out.println("Pair with given diff " + k + " is (" + arr[i] + ", "+temp+")");
        		 count++;
        	 }
             binmap[temp] = false;
        }
        
        return count++;
    }
	
	static int  printpairs(int arr[],int size, int k)
    {
		int count = 0;  // Initialize count
		 // Declares and initializes the whole array as false
        boolean[] hashmap = new boolean[MAX];

     // Insert array elements to hashmap
       /* for (int i = 0; i < size; i++)
            hashmap[arr[i]] = true;*/
        
     // Insert array elements to hashmap
        for(int i=0; i<size; i++)
        {
        	 int temp = k+arr[i];
        	 // checking for condition
             if (hashmap[temp])
             {
            	 System.out.println("Pair with given diff " + k + " is (" + arr[i] + ", "+temp+")");
            	 count++;
             }
             hashmap[arr[i]] = true;
        }
        return count;
    }
	
	static int kDifferencePairs(int arr[], int n, int k)
	{
		int count = 0;
		Arrays.sort(arr);//sort array elements
		
		int a = 0;
		int b = 0;
		while(b<n)
		{
			if(arr[b] - arr[a] == k)
			{
				count++;
				a++;
				b++;
			}
			else if(arr[b] - arr[a] > k)
				a++;
			else //(arr[b] - arr[a] > k)
				b++;
		}
		return (count);
	}

	
	public static void main(String[] args) {

		int []arr = {1, 5, 3, 4, 2};
		int diff =3;
		int size = arr.length;
		
		//System.out.println("Count : "+printpairs(arr,diff));
		//System.out.println("Count of diff : "+printpairs(arr,size,diff));
		System.out.println("Count Diff--> "+kDifferencePairs(arr,size,diff));
	}

}
// Time Complexity : O(n) 