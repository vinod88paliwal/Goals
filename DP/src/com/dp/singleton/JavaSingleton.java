package com.dp.singleton;

public class JavaSingleton {

	private static final JavaSingleton INSTANCE = new JavaSingleton();
	
	private JavaSingleton() {

		if(INSTANCE !=null){
			
			throw new IllegalStateException("Instance already created");
		}
			System.out.println("Instance creation in progress...");
	}
	
	public static JavaSingleton getInstance() {
		return INSTANCE;
	}
	
}
