package com.ds.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vpaliwal on 9/10/17.
 */
//Note : This program is incomplete
public class SubarraySumForNegativeValuesAsWell {

    private boolean subarraySumForNegativeValues(int[] arr, int size, int sum) {

        Set<Integer> set = new HashSet<Integer>();

        int curr_sum= 0,temp= 0;

        for (int i=0; i< size ; i++){
            // add current element to curr_sum
            curr_sum +=arr[i];

            // if curr_sum is equal to target sum
            // we found a subarray starting from index 0
            // and ending at index i
           /* if(curr_sum == sum) {
                System.out.println("Sum found between indexes " + 0 + " and " + i);
                return true;
            }*/

               temp =  curr_sum - sum ;

                if(set.contains(temp)) {
                    System.out.println("Sum is found between in this Array whose sum is "+sum);
                    return true;
                }
                else
                    set.add(curr_sum);
        }

        System.out.println("No subarray found");
        return false;

    }

    public static void main(String[] args) {

        SubarraySumForNegativeValuesAsWell obj = new SubarraySumForNegativeValuesAsWell();

        int arr[] = {8,5,-2,3,4,-5,7};
        int size = arr.length;
        int sum = 10;
        obj.subarraySumForNegativeValues(arr,size, sum);
    }

    //T.C. : O(n)
    //S.C. : O(n) // as maintaining set of same array size


}
