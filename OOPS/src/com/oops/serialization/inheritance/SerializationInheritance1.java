package com.oops.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//superclass A1 - No Serializable 
class A1
{
 int i;
 
 // Parameterised constructor
 public A1(int i) 
 {
	 System.out.println("A1's class Parameterised constructor ");
     this.i = i;
 }
  
 //this constructor must be present - otherwise we will get runtime exception
 public A1()
 {
	 System.out.println("A1's class default constructor called");
    // i = 50;
 }
}


// subclass B1 - implementing Serializable interface
class B1 extends A1 implements Serializable
{
    int j;
  
 // Parameterised constructor
 public B1(int i,int j) 
 {
     super(i);
     this.j = j;
 }
}

public class SerializationInheritance1{

	public static void main(String[] args) throws Exception 
    {
        B1 b1 = new B1(10,20);
         
        System.out.println("i = " + b1.i);
        System.out.println("j = " + b1.j);
         
        // Serializing B1's(subclass) object 
         
        //Saving of object in A1 file
        FileOutputStream fos = new FileOutputStream("abc3.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
             
        // Method for serialization of B1's class object
        oos.writeObject(b1);
             
        // closing streams
        oos.close();
        fos.close();
             
        System.out.println("Object has been serialized");
         
        // De-Serializing B1's(subclass) object 
         
        // Reading the object from A1 file
        FileInputStream fis = new FileInputStream("abc3.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
             
        // Method for de-serialization of B1's class object
        B1 b2 = (B1)ois.readObject(); //While preparing the object JVM will call default constructor of Super Class (A1) , otherwise :  java.io.InvalidClassException: com.oops.serialization.inheritance.B1; no valid constructor
             
        // closing streams
        ois.close();
        fis.close();
             
        System.out.println("Object has been deserialized");
         
        System.out.println("i = " + b2.i);
        System.out.println("j = " + b2.j);
    }

}