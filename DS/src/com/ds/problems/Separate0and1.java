package com.ds.problems;

/**
 * Created by vpaliwal on 9/9/17.
 */
public class Separate0and1 {

    void separate0and1Values(int []arr, int size){

            int leftIndx= 0,rightIndx= size -1;

            while (leftIndx < rightIndx){

                while ((arr[leftIndx] ==0) && (leftIndx < rightIndx))
                        leftIndx ++;

                while ((arr[rightIndx] ==1) && (rightIndx > leftIndx ))
                    rightIndx --;
                
                if(leftIndx < rightIndx){
                    arr[leftIndx ++] =0;
                    arr[rightIndx --] =1;

                }
            }
    }
    
    
    //Time Complexity O(n).
    void separate0and1Values_1(int []a, int size){
    	
    		int j = -1;
        for (int i = 0; i < size; i++) {
 
            // if number is smaller than 1
            // then swap it with j-th number
            if (a[i] < 1) {
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }


    public static void main(String[] args) {
        Separate0and1 obj = new Separate0and1();

            int []arr ={0,1,0,0,1,0,1,0,1};

            //obj.separate0and1Values(arr,arr.length);
            obj.separate0and1Values_1(arr,arr.length);

            for(int i : arr)
                System.out.print(i+" ");


    }
}
