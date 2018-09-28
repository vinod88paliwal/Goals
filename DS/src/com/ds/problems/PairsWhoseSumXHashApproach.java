package com.ds.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vpaliwal on 9/1/17.
 */
public class PairsWhoseSumXHashApproach {

      static void printPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }
        Set set = new HashSet(numbers.length);

        for(int value : numbers){
            int target = n - value;

            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }


    public static void main(String[] args) {

        PairsWhoseSumXHashApproach obj = new PairsWhoseSumXHashApproach();

       // int []arr = {3,5,8,3,4,9,7,8,6};
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 16;

        obj.printPairsUsingSet(arr,sum);

    }


}
