package com.vinod.newanalytical;

import java.util.*;

public final class ObjectFactoryWith5Objects {

	public final static int MAX_INSTANCES = 5;
	private static List<ObjectFactoryWith5Objects> instanceList = new ArrayList<>();

	private ObjectFactoryWith5Objects() {}
	
	public static ObjectFactoryWith5Objects getInstance() {
		System.out.println("Pool Size : "+(instanceList.size()));
		
		if(instanceList.size() > MAX_INSTANCES) 
			throw new RuntimeException("Hey! You have reached to the maximum of instances : "+MAX_INSTANCES);
		
		ObjectFactoryWith5Objects obj = new ObjectFactoryWith5Objects();
		instanceList.add(obj);
		
		System.out.println("Object created !!!");
		return obj;
	}

	public static void destroy(ObjectFactoryWith5Objects instance) {
		
		instanceList.remove(instance);
	}
	
	
	
	public static void main(String[] args) {

		ObjectFactoryWith5Objects.getInstance();
		ObjectFactoryWith5Objects.getInstance();
		ObjectFactoryWith5Objects.getInstance();
		ObjectFactoryWith5Objects.getInstance();
		ObjectFactoryWith5Objects.getInstance();
		ObjectFactoryWith5Objects.getInstance();
		ObjectFactoryWith5Objects.getInstance();
		
	}

}
