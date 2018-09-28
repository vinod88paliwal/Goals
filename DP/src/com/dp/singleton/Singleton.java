package com.dp.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* Points to remember :
 1. Making constructor private so noone can create object of the class from outside.
 2. Making class final so that no other class can extends it otherwise if we create instance of subclass then its Superclass (Singleton) class default constructor will be called and Singleton class another object will be created.
 3. Based on if condition Throwing RuntimeException from constructor to keep safe from newInstance()
 4. Overriding readResolve() so that i will return same instance of Singleton class during deserialization process.
 5. Overriding clone() method so that i will return same instance of Singleton class during cloning.
 */

public final class Singleton implements Serializable{

	private static Singleton instance=null;
	
 //Constructor will be called from newInstance() , 	
	private Singleton(){
		System.out.println("Constructor called!!!");
		
		if(Singleton.instance != null) //To keep safe from reflection
			throw new RuntimeException("Again Instantiation not allowed!!!");
	}
	
	public static Singleton getInstance1() {
		
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null)
					 instance = new Singleton();
			}
		}
		return instance;
	}
	
	 // implement readResolve method
    protected Object readResolve() //To keep safe from DeSerialization
    {
    	System.out.println("readResolve() called!!!");
    	return instance;
    }
    
   //If i don`t override clone() method then --> 
    //1. if someone implements clonable interface in this class then he will get new Object. 
    //2.  If someone directly try to clone the object with overriding clone() then, he will get ->  java.lang.CloneNotSupportedException: com.dp.singleton.Singleton	
    protected Object clone() throws CloneNotSupportedException  //To keep safe from cloning
  	{
      	System.out.println("clone() called!!!");
  	    return instance;
  	 }
    
    
    public static void main(String[] args) {
    		System.out.println("Starting...");
    	Singleton obj1 = Singleton.getInstance1();
    	
    	
    	try {
    		
    			// ************  Reflection Test ************	
    			
		 		Constructor cons = Singleton.class.getDeclaredConstructor();
		 		Singleton obj2 = (Singleton) cons.newInstance();
				
				System.out.println(obj1.hashCode() +" -Reflection- "+obj2.hashCode()); 
				
				// ************  Cloning Test ************	
			
				Singleton obj3 =(Singleton) obj1.clone();
				System.out.println(obj1.hashCode() +" -Cloning- "+obj3.hashCode());
				
				// ************  Serialization Test ************	
				
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("abc1.txt"));
					out.writeObject(obj1);
					
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc1.txt"));
				Singleton obj4 = (Singleton) in.readObject();
					
				System.out.println(obj1.hashCode() +" -Serialization- "+obj4.hashCode());
				
				// ************  getInstance() Test ************	
				
				Singleton obj5 = (Singleton) Class.forName("com.dp.singleton.Singleton").newInstance();
				System.out.println(obj1.hashCode() +" -getInstance()- "+obj5.hashCode());
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
