package com.collections.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentHashMapTest {

	static final int SIZE = 1000000;
	static final int THREADS = 16;
	static final ExecutorService executor = Executors.newFixedThreadPool(THREADS);

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 10; i++) {
			System.out.println("Concurrent one thread");
			addSingleThread(new ConcurrentHashMap());
			
			System.out.println("Concurrent multiple threads");
			addMultipleThreads(new ConcurrentHashMap());
			
			System.out.println("Synchronized one thread");
			addSingleThread(Collections.synchronizedMap(new HashMap()));
			
			System.out.println("Synchronized multiple threads");
			addMultipleThreads(Collections.synchronizedMap(new HashMap()));
		}
		executor.shutdown();
	}

	private static void addSingleThread(Map map) {
		long start = System.nanoTime();
		for (int i = 0; i < SIZE; i++) {
			map.put(i, i);
		}
		System.out.println(map.size()); // use the result
		long end = System.nanoTime();
		System.out.println("time with single thread: " + (end - start)/ 1000000);
	}

	private static void addMultipleThreads(final Map map) throws Exception {
		List<Runnable> runnables = new ArrayList<Runnable>();
		for (int i = 0; i < THREADS; i++) {
			final int start = i;
			runnables.add(new Runnable() {

				@Override
				public void run() {
					// Trying to have one runnable by bucket
					for (int j = start; j < SIZE; j += THREADS) {
						map.put(j, j);
					}
				}
			});
		}
		List<Future> futures = new ArrayList<Future>();
		long start = System.nanoTime();
		for (Runnable r : runnables) {
			futures.add(executor.submit(r));
		}
		for (Future f : futures) {
			f.get();
		}
		System.out.println(map.size()); // use the result
		long end = System.nanoTime();
		System.out.println("time with multiple threads: " + (end - start)/ 1000000);
	}
}
