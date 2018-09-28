package com.dp.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingletonSerializable implements Serializable {

	// public instance initialized when loading the class
    public static SingletonSerializable instance = new SingletonSerializable();
     
    private SingletonSerializable() 
    {
        // private constructor
    }
     
    // implement readResolve method
    protected Object readResolve()
    {
        return instance;
    }
}


public class SingletonSerializableTest 
{
 
    public static void main(String[] args) 
    {
        try
        {
        	SingletonSerializable instance1 = SingletonSerializable.instance;
        	
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
           
            out.writeObject(instance1);
            out.close();
         
            // deserailize from file to object
            ObjectInput in  = new ObjectInputStream(new FileInputStream("file.text"));
            SingletonSerializable instance2 = (SingletonSerializable) in.readObject();
            in.close();
         
            System.out.println("instance1 hashCode:- " + instance1.hashCode());
            System.out.println("instance2 hashCode:- " + instance2.hashCode());
        } 
         
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}