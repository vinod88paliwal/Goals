package com.thread.locks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
//1.
public class ReadWriteList<E> {

	private List<E> list = new ArrayList<>();
    private ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private Lock writeLock = rwLock.writeLock();
    private Lock readLock = rwLock.readLock();
    
    public ReadWriteList(E... initialElements) {
        list.addAll(Arrays.asList(initialElements));
    }
 
    public void add(E e) {
    	writeLock.lock();
    	
    	try {
				list.add(e);
		} finally {
			writeLock.unlock();
		}
    }
   public E get(int idx) {
	   readLock.lock();
	   
	   try {
		  return list.get(idx); 
	   	} finally {
	   		readLock.unlock();
	   	}
   }
    
    public int size() {
    	readLock.lock();
    	try {
    		return list.size();
		} finally {
		readLock.unlock();	
		}
    }
	
}
