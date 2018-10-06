package com.oops.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/// superclass A2 - implementing Serializable interface
class A2 implements Serializable
{
 int i;
  
 // parameterized constructor
 public A2(int i) 
 {
     this.i = i;
 }
  
}

//subclass B2 - B2 class doesn't implement Serializable interface.
class B2 extends A2
{
 int j;
  
 // parameterized constructor
 public B2(int i,int j) 
 {
     super(i);
     this.j = j;
 }
  
 // By implementing writeObject method, 
 // we can prevent - subclass from serialization
 private void writeObject(ObjectOutputStream out) throws IOException
 {
     throw new NotSerializableException();
 }
  
 // By implementing readObject method, 
 // we can prevent - subclass from de-serialization
 public void readObject(ObjectInputStream in) throws IOException
 {
     //throw new NotDeserializationException("Can`t Deserialize");
 }
  
}

//Driver class
public class SerializationInheritance2
{
 public static void main(String[] args) throws Exception 
 {
     B2 b1 = new B2(10, 20);
      
     System.out.println("i = " + b1.i);
     System.out.println("j = " + b1.j);
      
     // Serializing B2's(subclass) object 
      
     //Saving of object in A2 file
     FileOutputStream fos = new FileOutputStream("abc22.ser");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
          
     // Method for serialization of B2's class object
     oos.writeObject(b1);
          
     // closing streams
     oos.close();
     fos.close();
          
     System.out.println("Object has been serialized");
      
     // De-Serializing B2's(subclass) object 
      
     // Reading the object from A2 file
     FileInputStream fis = new FileInputStream("abc22.ser");
     ObjectInputStream ois = new ObjectInputStream(fis);
          
     System.out.println("Object is going to be deserialized");  
     // Method for de-serialization of B2's class object
     B2 b2 = (B2)ois.readObject();
          
     // closing streams
     ois.close();
     fis.close();
          
     System.out.println("Object has been deserialized");
      
     System.out.println("i = " + b2.i);
     System.out.println("j = " + b2.j);
 }
}