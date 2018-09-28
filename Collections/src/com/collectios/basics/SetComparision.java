package com.collectios.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Java program to demonstrate difference between TreeSet, HashSet and LinkedHashSet
 * in Java Collection.
 * @author
 */
public class SetComparision {
 
    public static void main(String args[])
    {            
        HashSet<String> fruitsStore = new HashSet<String>();
        LinkedHashSet<String> fruitMarket = new LinkedHashSet<String>();
        TreeSet<String> fruitBuzz = new TreeSet<String>();
     
        for(String fruit: Arrays.asList("mango", "apple", "banana")){
            fruitsStore.add(fruit);
            fruitMarket.add(fruit);
            fruitBuzz.add(fruit);
        }
       
        //no ordering in HashSet – elements stored in random order
        System.out.println("Ordering in HashSet :" + fruitsStore);

        //insertion order or elements – LinkedHashSet stores elements as insertion
        System.err.println("Order of element in LinkedHashSet :" + fruitMarket);

        //should be sorted order – TreeSet stores element in sorted order
        System.out.println("Order of objects in TreeSet :" + fruitBuzz); 
     

        //Performance test to insert 1M elements in HashSet, LinkedHashSet and TreeSet
        Set<Integer> numbers = new HashSet<Integer>();
        long startTime = System.nanoTime();
        for(int i =0; i<1000000; i++){
            numbers.add(i);
        }
        long endTime = System.nanoTime();

        System.out.println("Total time to insert 1M elements in HashSet in sec : "
                            + (endTime - startTime));
     
     
        // LinkedHashSet performance Test – inserting 1M objects
        numbers = new LinkedHashSet<Integer>();
        startTime = System.nanoTime();
        for(int i =0; i<1000000; i++){
            numbers.add(i);
        }
        endTime = System.nanoTime();
        
        System.out.println("Total time to insert 1M elements in LinkedHashSet in sec : "
                            + (endTime - startTime));
       
        // TreeSet performance Test – inserting 1M objects
        numbers = new TreeSet<Integer>();
        startTime = System.nanoTime();
        for(int i =0; i<1000000; i++){
            numbers.add(i);
        }
        endTime = System.nanoTime();
        
        System.out.println("Total time to insert 1M elements in TreeSet in sec : "
                            + (endTime - startTime));
    }
}
