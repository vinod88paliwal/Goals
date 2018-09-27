package com.thread.producerconsumer.waitnotify;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class Consumer implements Runnable {

	private final List<?> sharedQueue;

	public Consumer(List<?> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) { 
			try {
				synchronized (sharedQueue) {
					// wait if queue is empty
					if (sharedQueue.isEmpty()) {

						System.out.println("Queue is empty " + Thread.currentThread().getName() +
								" is waiting , size: " + sharedQueue.size());
						sharedQueue.wait();
					}
					// Otherwise consume element and notify waiting producer
					System.out.println("Consumed: " + sharedQueue.remove(0));
					sharedQueue.notifyAll();
				}
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE,null, ex);
			}
		}
	}
}