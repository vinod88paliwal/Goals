package com.dp.singleton;

public enum SingletonEnum {

	INSTANCE;
	
	public static SingletonEnum getInstance() {
		return INSTANCE;
	}
}
