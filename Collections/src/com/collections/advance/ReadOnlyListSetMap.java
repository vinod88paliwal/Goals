
package com.collections.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Java program to create read only List, Set and Map in Java. You can first create
 * a List or Set and than make it unmodifiable or read-only by
 * using  Collections.unmodifiableList() or Collections.unmodifiableSet() method.
 *
 * @author Vinod Paliwal
 */
public class ReadOnlyListSetMap {
 
    public static void main(String args[]) {            
       
        // creating List in Java
        List<String> contents = new ArrayList<String>();
     
        // initializing List in Java
        contents.add("Example");
        contents.add("Tutorial");
        contents.add("Program");
     
     
        // Currently This List is not read only, you can add or remove elements from List
        contents.add("Tips"); //should not be allowed if List is read only.
     
        System.err.println("normal List in Java : " + contents);
     
        //creating readonly List from contents
        contents = Collections.unmodifiableList(contents);

        
        //java.lang.UnsupportedOperationException -- no modification in read only list
     
       //not allowed as it is read-only List in Java
       contents.add("Can I add object into read only List - No");

       
        contents.remove("Example"); //remove not allowed in read only list
     
        //java.lang.UnSupportedOperation - List update not allowed
        contents.set(0, "Can I override or set object in read-only Set - No");

     
        //Creating read only Set in Java
        //similar to read-only List you can also create a Set which is read only
        //i.e. addition , removal and modification operation is not permitted on list
     
     
        //Creating a Set based on contents of List      
        Set<String> readOnlySet = new HashSet<String>(contents);
     
        System.out.println("original Set in Java : " + readOnlySet);

        //Set is not yet read-only you can still add elements into Set
        readOnlySet.add("Override");

        System.out.println("Set before making read only : " + readOnlySet);
     
        //making Set readonly in Java - no add remove or set operation permitted
        readOnlySet = Collections.unmodifiableSet(readOnlySet);
     
        //trying to add element in read only Set - java.lang.UnSupportedOperationException
        readOnlySet.add("You can not add element in read Only Set");
     
        //trying to remove element from read only set
        readOnlySet.remove("Example"); //you can not remove elements from read only Set
     
     
     
        // Creating read only Map in Java
        // Similar to List and Set you can also create read only or unmodifiable Map in Java
        // add , remove and override is not allowed on read only Map in Java
     
        Map<String, String> contries = new HashMap<String, String>();      
        contries.put("India", "New Delhi");
     
        //Map is not read only yet, you can still add entries into
        contries.put("UK", "London");
     
        System.out.println("Map in Java before making read only: " + contries);
     
        //Making Map read only in Java
        Map readOnlyMap = Collections.unmodifiableMap(contries);
       
        //you can not put a new entry in read only Map in Java
        readOnlyMap.put("USA", "Washington"); //java.lang.UnSupportedOperation
       
        //you can not remove keys from read only Map in Java
        readOnlyMap.remove("UK"); //java.lang.UnSupportedOperation
     
    }
 
}
