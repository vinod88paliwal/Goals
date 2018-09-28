package com.oops.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//superclass A - implementing Serializable interface
class A0 
{
 int i;
  
 // parameterized constructor
 public A0(int i) 
 {
     this.i = i;
 }
  
}


//subclass B - B class doesn't implement Serializable interface.
class B0 extends A0 implements Serializable
{
 int j;
  
 // parameterized constructor
 public B0(int i, int j) 
 {
     super(i);
     this.j = j;
 }
}

public class SerializationInheritance0{

public static void main(String[] args) 
        throws Exception 
{
	A0 a1 = new A0(10);
     
    System.out.println("i = " + a1.i);
     
    /* Serializing B's(subclass) object */
     
    //Saving of object in a file
    FileOutputStream fos = new FileOutputStream("abc.ser");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
         
    // Method for serialization of B's class object
    oos.writeObject(a1); //com.oops.serialization.inheritance.SerializationInheritance0.main(SerializationInheritance0.java:52)
         
    // closing streams
    oos.close();
    fos.close();
         
    System.out.println("Object has been serialized");
     
    /* De-Serializing B's(subclass) object */
     
    // Reading the object from a file
    FileInputStream fis = new FileInputStream("abc.ser");
    ObjectInputStream ois = new ObjectInputStream(fis);
         
    // Method for de-serialization of B's class object
    A0 a2 = (A0)ois.readObject();
         
    // closing streams
    ois.close();
    fis.close();
         
    System.out.println("Object has been deserialized");
     
    System.out.println("i = " + a2.i);
}
}