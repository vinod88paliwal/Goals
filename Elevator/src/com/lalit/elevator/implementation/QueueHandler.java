package com.lalit.elevator.implementation;

import java.util.Deque;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueHandler {
	public static Deque<Object> readQ = new LinkedBlockingDeque<>();
	public static volatile int currentLiftLevel = 0;
	public static volatile String liftMovingDirection;
	private static volatile TreeSet<Integer> liftStoppages = new TreeSet<Integer>();

	public static void setLiftMovingDirection(String liftMovingDirection) {
		QueueHandler.liftMovingDirection = liftMovingDirection;
	}

	public static void setCurrentLiftLevel(int currentLiftLevel) {
		QueueHandler.currentLiftLevel = currentLiftLevel;
	}

	public static TreeSet<Integer> getLiftStoppages() {
		return liftStoppages;
	}

	public static void addLiftStoppages(int liftStoppages) {
		QueueHandler.liftStoppages.add(liftStoppages);
	}

	public static boolean removeLiftStoppages(int liftStoppages) {
		return QueueHandler.liftStoppages.remove(liftStoppages);
	}

	public static void enqueue(Object object) {
		// do some stuff
		readQ.add(object);
	}

	public static void enqueueOnFront(Object object) {
		// do some stuff
		readQ.addFirst(object);
	}

	public static Object dequeue() {
		// do some stuff
		return readQ.poll();
	}
}