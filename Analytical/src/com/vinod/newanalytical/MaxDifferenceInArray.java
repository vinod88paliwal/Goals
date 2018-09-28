package com.vinod.newanalytical;

/**
 * Created by vpaliwal on 9/8/17.
 */
//Maximum difference between two subsets of m elements
public class MaxDifferenceInArray {

    int getMaxDifference(int []arr){

        int min_ele_so_far = arr[0];
        int maxdiff_so_far = arr[1] - arr[0];
        int curr_diff      = arr[1] - arr[0];

        for (int i : arr){

            if(i < min_ele_so_far)
                min_ele_so_far = i;

            else {
                curr_diff = i - min_ele_so_far;
                if(curr_diff > maxdiff_so_far)
                    maxdiff_so_far = curr_diff;
            }
        }

        return maxdiff_so_far;
    }

    public static void main(String[] args) {

        MaxDifferenceInArray obj =new MaxDifferenceInArray();

          int []arr = {4,3,10,2,9,1,6};
     //   int []arr = {1,2,3,4,5};
        
        
        int maxDiff=  obj.getMaxDifference(arr);
        System.out.println("Maximum Difference : "+maxDiff);
    }


}
