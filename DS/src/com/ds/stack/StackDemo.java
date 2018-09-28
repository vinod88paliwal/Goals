package com.ds.stack;

import java.util.Arrays;

public class StackDemo {
	
	private static  int capacity = 3;
	private Object arr[];
	private int top = -1;
	
	public StackDemo()
	{
		arr = new Object[capacity];
	}	

	public StackDemo(int cap)
	{
		arr = new Object[cap];
	}	
	
	public void push(Object pushedElement) {
	
		if(top+1 == capacity){
			System.out.println("Increasing size.. !!!!");
			ensureCapacity();
		}
			
		if (top < capacity) { //Here (capacity - 1) will give size of the array. 
			top++;
			arr[top] = pushedElement;
			System.out.println("Element " + pushedElement+ " is pushed to Stack !");
			printElements();
		} else {
			System.out.println("Stack Overflow !");
		}
	}

	public void pop() {
		if (top >= 0) {
			arr[top] = null;
			top--;
			System.out.println("Pop operation done !");
		} else {
			System.out.println("Stack Underflow !");
		}
	}

	private void ensureCapacity() {
		capacity = arr.length * 2;
	    arr = Arrays.copyOf(arr, capacity);
	    
	    System.out.println("New size of Array: "+arr.length);
	  }
	
	public void printElements() {
		if (top >= 0) {
			System.out.println("Elements in stack :");
			for (int i = 0; i <= top; i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		StackDemo stackDemo = new StackDemo();

		stackDemo.pop();
		stackDemo.push(23);
		stackDemo.push(2);
		stackDemo.push("Hello");
		stackDemo.push(21);
		stackDemo.pop();
		stackDemo.pop();
		stackDemo.pop();
		stackDemo.pop();
		stackDemo.pop();
	}

}