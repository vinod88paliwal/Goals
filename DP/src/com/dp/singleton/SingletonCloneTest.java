package com.dp.singleton;

 class SingletonClone {

	// public instance initialized when loading the class
	  public static SingletonClone instance = new SingletonClone();
	 
	  private SingletonClone() 
	  {
	    // private constructor
	  }
	 
	  @Override
	  protected Object clone() throws CloneNotSupportedException 
	  {
	    return instance;
	  }
	}
 
 
 public class SingletonCloneTest
 {
	  public static void main(String[] args) throws CloneNotSupportedException 
	  {
		  SingletonClone instance1 = SingletonClone.instance;
		  SingletonClone instance2 = (SingletonClone) instance1.clone();
	 
		System.out.println("instance1 hashCode:- " + instance1.hashCode());
	    System.out.println("instance2 hashCode:- "+ instance2.hashCode()); 
	    
	  }
	}