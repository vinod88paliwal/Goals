package com.ds.problems;

/**
 * Created by vpaliwal on 9/8/17.
 */

//Assuming that only one occured Odd number of times and rest are occurring even times
public class NumberOccuredOddTimesXORArray {

    int getOddOccurrenceNumber (int []arr , int size){
        int result =0;

        for (int indx= 0; indx <size ; indx++){

                result = result ^ arr[indx];
        }
        return  result;
    }


    public static void main(String[] args) {
        NumberOccuredOddTimesXORArray obj = new NumberOccuredOddTimesXORArray();

        int []arr = {1,2,3,2,1,2,3,4,4};

        int oddTimesNumber = obj.getOddOccurrenceNumber(arr,arr.length);

        System.out.println("Numder occured Odd Number of times : "+ oddTimesNumber);

    }

}
