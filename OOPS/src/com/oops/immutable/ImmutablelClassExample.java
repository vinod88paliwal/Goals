package com.oops.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public final class ImmutablelClassExample {
	 
    private final int id;
    private String name;
    private final HashMap<String,String> testMap;
    private Date mutableDate; // I did not put final here
    
    /**
     * Constructor performing Deep Copy
     * @param i
     * @param n
     * @param hm
     */
     
    public ImmutablelClassExample(int i, String n, HashMap<String,String> hm , Date date){
        System.out.println("Performing Deep Copy for Object initialization");
        this.id=i;
        this.name=n;
        HashMap<String,String> tempMap=new HashMap<String,String>();
        String key;
        Iterator<String> it = hm.keySet().iterator();
        while(it.hasNext()){
            key=it.next();
            tempMap.put(key, hm.get(key));
        }
        this.testMap=tempMap;
    
      //this is very important else what would happen is if we change the reference, then all will change
        this.mutableDate = new Date(date.getTime());
    }
     
     
    /**
     * Constructor performing Shallow Copy
     * @param i
     * @param n
     * @param hm
     */
    
  /*  public FinalClassExample(int i, String n, HashMap<String,String> hm){
        System.out.println("Performing Shallow Copy for Object initialization");
        this.id=i;
        this.name=n;
        this.testMap=hm;
    }
    */
     
    /**
     * Accessor function for mutable objects
     */
    public HashMap<String, String> getTestMap() {
        //return testMap;
        return (HashMap<String, String>) testMap.clone();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
	public Date getMutableDate() {
		return mutableDate;
	}


	/**
     * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
     * @param args
	 * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException {
    	
        HashMap<String, String> h1 = new HashMap<String,String>();
        h1.put("1", "first");
        h1.put("2", "second");
         
        String s = "original";
        int i=10;
         
        ImmutablelClassExample ce = new ImmutablelClassExample(i,s,h1, new Date());
         
        //Lets see whether its copy by field or reference
        System.out.println(s==ce.getName());
        System.out.println(h1 == ce.getTestMap());
        //print the ce values
        System.out.println("ce id:"+ce.getId());
        System.out.println("ce name:"+ce.getName());
        System.out.println("ce testMap:"+ce.getTestMap());
        System.out.println("Date : "+ce.getMutableDate());
        
        //change the local variable values
        i=20;
        s="modified";
        h1.put("3", "third");
        
        Date date = ce.getMutableDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "01-07-1991 10:20:56";
        date = sdf.parse(dateInString);
        System.out.println("I changed Date : "+date);
        
        
        //print the values again
        System.out.println("ce id after local variable change:"+ce.getId());
        System.out.println("ce name after local variable change:"+ce.getName());
        System.out.println("ce testMap after local variable change:"+ce.getTestMap());
         
        HashMap<String, String> hmTest = ce.getTestMap();
        hmTest.put("4", "new");
         
        System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestMap());
 
        System.out.println("ce testMap after local variable change:"+ce.getMutableDate());
    }
 
    
}