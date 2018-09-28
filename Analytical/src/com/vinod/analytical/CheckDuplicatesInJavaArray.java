package com.vinod.analytical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesInJavaArray {

    public static void main(String args[])  {
       
String[] withDuplicates = new String[] {"one","two","three","one"};
String[] withoutDuplicates = new String[] {"one","two","three"};
      
System.out.println("Checking array with duplicate using brute force: " + bruteforce(withDuplicates));
System.out.println("Checking array without any duplicate using brute force: " + bruteforce(withoutDuplicates));
      
System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingSet(withoutDuplicates));

System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));
System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingAdd(withoutDuplicates));
    }
  
    
    /*
     * brute force way of checking if array contains duplicates in Java
     * comparing each elements to all other elements of array
     * complexity on order of O(n^2) not advised in production
     */
    public static boolean bruteforce(String[] input)
    {
        for (int i = 0; i < input.length; i++)
        {
            for (int j = 0; j < input.length; j++) 
            {
                if (input[i].equals(input[j]) && i != j) 
                {
                    return true;
                }
            }
        }
        return false;
    }
    /*
     * detect duplicate in array by comparing size of List and Set
     * since Set doesn't contain duplicate, size must be less for an array which contains duplicates
     */
    public static boolean checkDuplicateUsingSet(String[] input)
    {
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);
        
        
        if(inputSet.size()< inputList.size())
        {
            return true;
        }
        return false;
    }
  
    /*
     * Since Set doesn't allow duplicates add() return false
     * if we try to add duplicates into Set and this property
     * can be used to check if array contains duplicates in Java
     */
    public static boolean checkDuplicateUsingAdd(String[] input) 
    {
        Set tempSet = new HashSet();
        
        for (String str : input) 
        {
            if (!tempSet.add(str)) 
            {
                return true;
            }
        }
        return false;
    }
}
