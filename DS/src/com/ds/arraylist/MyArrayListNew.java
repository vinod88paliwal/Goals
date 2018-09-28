package com.ds.arraylist;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;


public class MyArrayListNew<E> {

	private Object elementData[];
	private int size ;

	public Iterator<E> iterator() {
        return new MyIterator();
    }
	
	public MyArrayListNew(){
		elementData = new Object[10];
	}
	
	 public MyArrayListNew(int initialCapacity){
    	 if (initialCapacity > 0)
    		 this.elementData = new Object[initialCapacity];
    	 
             throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
    }
	 
	public void add(E e ){

		if(elementData.length - size <= elementData.length/2 )
				elementData = Arrays.copyOf(elementData, size*2);

			elementData[size++] = e;
	}

	@SuppressWarnings("unchecked")
	public E get(int index){
		if(index >=size || index < 0){
			 throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
		}
		return (E) elementData[index];
	}
	
	@SuppressWarnings("unchecked")
	public E remove(int index){
		if(index >=size || index <= 0){
			 throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
		}
		Object obj=	elementData[index];
		elementData[index] = null;
		
		while (index < size) {
			elementData[index] = elementData[index+1];
			elementData[index+1]=null;
			index++;
		}
		size--;
		
		return (E) obj ;
	}
	
	public int size(){
		return size;
	}

	@Override
	public String toString() {
		int count =0;
		StringBuilder sb = new StringBuilder();
		
		while (count< size) {
			sb.append(elementData[count]);
			count++;
			if(count < size){
				sb.append(",");
			}
		}
		
		return "["+ sb +"]" ;
	}
	
	//Inner class to create Custom Iterator
		class MyIterator implements Iterator<E> {
			private	int expectedModCount = size;
			private	int current = 0;
			
			public MyIterator() { }
			
			@Override
			public boolean hasNext() {
				if(current < size)
					return true;
				else
				return false;
			}

			@SuppressWarnings("unchecked")
			@Override
			public E next() {	
				if (size != expectedModCount)
			        throw new ConcurrentModificationException();
				
				return (E) elementData[current++] ;
			}
		}
}
