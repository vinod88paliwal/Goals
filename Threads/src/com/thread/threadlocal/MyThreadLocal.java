package com.thread.threadlocal;
//2.
public class MyThreadLocal {

    public static final ThreadLocal<Context> userThreadLocal = new ThreadLocal<Context>();

    public static void set(Context ctx) {
        userThreadLocal.set(ctx);
    }

    public static void unset() {
        userThreadLocal.remove();
    }

    public static Context get() {
        return  userThreadLocal.get();
    }
}