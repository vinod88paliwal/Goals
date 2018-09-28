package com.dp.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
	
	
public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
	
/*	JavaSingleton obj = JavaSingleton.getInstance();
	
	Class<JavaSingleton> cls  = JavaSingleton.class;
	
	Constructor<JavaSingleton>cons =	cls.getDeclaredConstructor();
	
	  JavaSingleton reflectionObj=   (JavaSingleton) cons.newInstance();
	  
	System.out.println("Check : "+reflectionObj.getClass().equals(cls));
	*/
	
	/********************* SingletonEnum Test ****************/
	
	
	
	
	System.out.println("SingletonEnum Instance : "+ SingletonEnum.getInstance());
	System.out.println("hashCode1111 : "+ SingletonEnum.getInstance().hashCode());
	System.out.println("hashCode222 : "+ SingletonEnum.getInstance().hashCode());
	
}
}
