package com.collections.sorting;

import java.util.*;

public class SortKeyInHashMap {

  public static void main (String[] args) throws java.lang.Exception
   {
     Map<Integer,String> Name = new HashMap<Integer, String>();
     Name.put(3,"ishant");
     Name.put( 1,"rahul");
     Name.put( 2,"aditya");
     Name.put( 4,"gautam");
                 
     //Sorting Map in Java by keys using TreeMap
     Map<Integer,String> sortedMapByKeys = new TreeMap<Integer,String>();
     sortedMapByKeys.putAll(Name);
     System.out.println("Sorted Map in Java by key using TreeMap : " + sortedMapByKeys);
    //sorting Map e.g. HashMap, Hashtable by keys in Java
     Map<Integer,String> sorted = sortByKeys(Name);
     System.out.println("Sorted Map in Java by key: " + sorted); 

     }
  
  public static <K extends Comparable,V extends Comparable> Map<K,V> sortByKeys(Map<K,V> map)
  {
     List<K> keys = new LinkedList<K>(map.keySet());
     Collections.sort(keys);
   
     //LinkedHashMap will keep the keys in the order they are inserted
     //which is currently sorted on natural ordering
     Map<K,V> sortedMap = new LinkedHashMap<K,V>();
     for(K key: keys){
         sortedMap.put(key, map.get(key));
     }
   
     return sortedMap;
 }

}