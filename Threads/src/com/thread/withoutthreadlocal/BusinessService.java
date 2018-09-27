package com.thread.withoutthreadlocal;
//3
public class BusinessService {

    public void businessMethod() {
        // get the context from thread local
        Context context = (Context) MyThreadLocal.getUserThreadLocal();
        System.out.println("Thread Id: "+context.getTransactionId());
    }
}