package com.lalit.elevator.implementation;

public class ElevatorSimpleVersion {

	private static Consumer consumer;
	private static Producer producer;

	public static void main(String args[]) {
		consumer = new Consumer();
		producer = new Producer();
	}
}