package com.thread.questions;

public class ThreadGroupClass {

	public static void main(String[] args) {
		System.out.println("Top Level Thread Group:" + Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println("Main Thread Group:" + Thread.currentThread().getThreadGroup().getName());
	}
}
