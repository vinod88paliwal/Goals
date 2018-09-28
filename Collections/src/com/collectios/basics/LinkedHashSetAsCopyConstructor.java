package com.collectios.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Java program to copy object from one HashSet to another using LinkedHashSet.
 * LinkedHashSet preserves order of element while copying elements.
 *
 * @author Javin
 */
public class LinkedHashSetAsCopyConstructor{
   
    public static void main(String args[]) {
       
        HashSet<String> source = new HashSet<String>(Arrays.asList("Set, List, Map"));
        System.out.println("source : " + source);
       
        Set<String> copy = LinkedHashSetAsCopyConstructor.copy(source);
        System.out.println("copy of HashSet using LinkedHashSet: " + copy);
    }
    /*
     * Static utility method to copy Set in Java
     */
    public static <T> Set<T> copy(Set<T> source){
           return new LinkedHashSet<T>(source);
    }
}
