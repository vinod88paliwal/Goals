package com.ds.arrays;

import java.util.HashSet;
import java.util.Set;
//https://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
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

      int []arr = {3,5,8,3,4,9,7,8,6};

      obj.printPairsUsingSet(arr,10);

  }
}
//Time Complexity : O(n)

/*
1) Initialize an empty hash table s.
2) Do following for each element A[i] in A[]
   (a)    If s[x - A[i]] is set then print the pair (A[i], x - A[i])
   (b)    Insert A[i] into s.
*/