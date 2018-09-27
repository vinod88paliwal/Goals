package com.thread.withoutthreadlocal;
//2.
public class MyThreadLocal {

	public static  Object userThreadLocal = new ThreadLocal<Context>();

	public static Object getUserThreadLocal() {
		return userThreadLocal;
	}

	public static void setUserThreadLocal(Object userThreadLocal) {
		MyThreadLocal.userThreadLocal = userThreadLocal;
	}

}