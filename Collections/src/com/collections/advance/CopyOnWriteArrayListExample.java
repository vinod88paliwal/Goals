package com.collections.advance;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

	public static void main(String args[]) {
	     
        CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
        threadSafeList.add("Java");
        threadSafeList.add("J2EE");
        threadSafeList.add("Collection");
     
        //add, remove operation is not supported by CopyOnWriteArrayList iterator
        Iterator<String> failSafeIterator = threadSafeList.iterator();
        
        while(failSafeIterator.hasNext()){
            System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
          
            threadSafeList.add("new Entry");
            
            //failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
            
            //If we uncomment, commented code which modifies CopyOnWriteArrayList using Iterator 
            //then we will get following Exception :
/*            Read from CopyOnWriteArrayList : Java 
            Exception in thread "main" java.lang.UnsupportedOperationException
            	at java.util.concurrent.CopyOnWriteArrayList$COWIterator.remove(Unknown Source)
            	at com.collections.advance.CopyOnWriteArrayListExample.main(CopyOnWriteArrayListExample.java:19)
*/
        }
        System.out.println(threadSafeList);
    }
}