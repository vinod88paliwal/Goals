package com.vinod.newanalytical;

import java.util.ArrayList;

public class SubArrayFor0And1 {


    static int index;
    public static void main(String args[]) {
      //  int arr[] ={0,0,1,0,1,0,0,0,1,1,1,0}; //{1,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1};
        int arr[] = {1,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1};
        
        int count = 1;
        int prevCount=1;
        int i = 0;
        
        while (i<(arr.length)-1)
        {

            if(arr[i]==arr[i+1]){
                count++;

                if(prevCount < count){
                    prevCount = count;
                    index =i+1;
                    }

                }
                else {

                count =1;
                 // index = i;
                }
                i++;

        }
        ArrayList<Integer> al = new ArrayList<Integer>();
            for(int j=index-prevCount+1; j<=index;j++){
                al.add(arr[j]);
                }
            System.out.println(al);
        }
}