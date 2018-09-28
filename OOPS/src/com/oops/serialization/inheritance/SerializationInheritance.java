package com.oops.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//superclass A - implementing Serializable interface
class A implements Serializable
{
 int i;
  
 // parameterized constructor
 public A(int i) 
 {
     this.i = i;
 }
  
}


//subclass B - B class doesn't implement Serializable interface.
class B extends A
{
 int j;
  
 // parameterized constructor
 public B(int i, int j) 
 {
     super(i);
     this.j = j;
 }
}

public class SerializationInheritance{

public static void main(String[] args) 
        throws Exception 
{
    B b1 = new B(10,20);
     
    System.out.println("i = " + b1.i);
    System.out.println("j = " + b1.j);
     
    /* Serializing B's(subclass) object */
     
    //Saving of object in a file
    FileOutputStream fos = new FileOutputStream("abc.ser");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
         
    // Method for serialization of B's class object
    oos.writeObject(b1);
         
    // closing streams
    oos.close();
    fos.close();
         
    System.out.println("Object has been serialized");
     
    /* De-Serializing B's(subclass) object */
     
    // Reading the object from a file
    FileInputStream fis = new FileInputStream("abc.ser");
    ObjectInputStream ois = new ObjectInputStream(fis);
         
    // Method for de-serialization of B's class object
    B b2 = (B)ois.readObject();
         
    // closing streams
    ois.close();
    fis.close();
         
    System.out.println("Object has been deserialized");
     
    System.out.println("i = " + b2.i);
    System.out.println("j = " + b2.j);
}
}