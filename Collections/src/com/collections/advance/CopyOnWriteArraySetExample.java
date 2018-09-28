package com.collections.advance;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;


public class CopyOnWriteArraySetExample {
	
    public static void main(String args[]){
        CopyOnWriteArraySet cset = new CopyOnWriteArraySet();
    
        cset.add("Mitali");
        cset.add("Nikhil");
       
        Iterator itr = cset.iterator();
       
        while(itr.hasNext()){
            System.out.println("Set Elements are-"+itr.next());
            cset.add("Vishal");
           // itr.remove(); not supportded on CopyOnWriteArraySetTestExample
        }
       
        Iterator itr1 = cset.iterator();
       
        while(itr1.hasNext()){
            System.out.println("After Modification Set Elements are-"+itr1.next());
           
        }
    }
}