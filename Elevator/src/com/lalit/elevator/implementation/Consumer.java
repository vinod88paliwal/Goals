package com.lalit.elevator.implementation;

import java.util.Iterator;

/**
 * @author lalit goyal
 *
 */
public class Consumer implements Runnable {
	public Consumer() {
		Thread consumer = new Thread(this);
		consumer.start();
	}

	public void run() {
		String liftMovingDirection = "";
		int finalFloorToGoInMovingDirection = 0;
		boolean isFinalLevelDecided = false;
		while (true) {
			if ((QueueHandler.readQ.size() == 0 && !QueueHandler.getLiftStoppages().isEmpty())) {
				if (!QueueHandler.getLiftStoppages().isEmpty()) {
					if (liftMovingDirection.equals("Down")) {
						QueueHandler.enqueueOnFront(new Requests(QueueHandler.currentLiftLevel, "Up",
								QueueHandler.getLiftStoppages().last()));
					} else {
						QueueHandler.enqueueOnFront(new Requests(QueueHandler.currentLiftLevel, "Down",
								QueueHandler.getLiftStoppages().first()));
					}
				}

			}
			if (QueueHandler.readQ.size() > 0) {
				Requests request = (Requests) QueueHandler.readQ.peek();
				if (QueueHandler.currentLiftLevel == request.requestingFloor) {
					request = (Requests) QueueHandler.dequeue();
					finalFloorToGoInMovingDirection = request.floorToGo;
					liftMovingDirection = request.directionToGo;
					isFinalLevelDecided = false;
				} else {
					finalFloorToGoInMovingDirection = request.requestingFloor;
					liftMovingDirection = request.requestingFloor < QueueHandler.currentLiftLevel ? "Down" : "Up";
					isFinalLevelDecided = true;
				}
				System.out.println("Lift started going from Level : " + QueueHandler.currentLiftLevel + " to Level : "
						+ finalFloorToGoInMovingDirection);
				QueueHandler.setLiftMovingDirection(liftMovingDirection);
				QueueHandler.addLiftStoppages(finalFloorToGoInMovingDirection);
				if (liftMovingDirection.equals("Down")) {
					try {
						Thread.sleep(1000);
						while (QueueHandler.currentLiftLevel > finalFloorToGoInMovingDirection) {
							if (QueueHandler.removeLiftStoppages(QueueHandler.currentLiftLevel)) {
								System.out.println("Lift stopped at Level " + QueueHandler.currentLiftLevel);
							}

							Iterator<Object> it = QueueHandler.readQ.iterator();
							while (it.hasNext()) {
								Requests req = (Requests) it.next();
								if (req.directionToGo.equals(QueueHandler.liftMovingDirection)
										&& (req.requestingFloor < QueueHandler.currentLiftLevel
												&& finalFloorToGoInMovingDirection < req.requestingFloor)) {
									QueueHandler.addLiftStoppages(req.requestingFloor);
									QueueHandler.addLiftStoppages(req.floorToGo);
									if (!isFinalLevelDecided) {
										finalFloorToGoInMovingDirection = req.floorToGo < finalFloorToGoInMovingDirection
												? req.floorToGo : finalFloorToGoInMovingDirection;
									}
									QueueHandler.readQ.remove(req);
								}
							}
							QueueHandler.setCurrentLiftLevel(QueueHandler.currentLiftLevel - 1);
							Thread.sleep(1000);
						}
					} catch (InterruptedException e) {
					}
				} else {
					try {
						Thread.sleep(1000);
						while (QueueHandler.currentLiftLevel < finalFloorToGoInMovingDirection) {
							if (QueueHandler.removeLiftStoppages(QueueHandler.currentLiftLevel)) {
								System.out.println("Lift stopped at Level " + QueueHandler.currentLiftLevel);
							}

							Iterator<Object> it = QueueHandler.readQ.iterator();
							while (it.hasNext()) {
								Requests req = (Requests) it.next();
								if (req.directionToGo.equals(QueueHandler.liftMovingDirection)
										&& (req.requestingFloor > QueueHandler.currentLiftLevel
												&& finalFloorToGoInMovingDirection > req.requestingFloor)) {
									QueueHandler.addLiftStoppages(req.requestingFloor);
									QueueHandler.addLiftStoppages(req.floorToGo);
									if (!isFinalLevelDecided) {
										finalFloorToGoInMovingDirection = req.floorToGo > finalFloorToGoInMovingDirection
												? req.floorToGo : finalFloorToGoInMovingDirection;
									}
									QueueHandler.readQ.remove(req);
								}
							}
							QueueHandler.setCurrentLiftLevel(QueueHandler.currentLiftLevel + 1);
							Thread.sleep(1000);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				QueueHandler.setCurrentLiftLevel(finalFloorToGoInMovingDirection);
				System.out.println("Lift stopped at Level " + QueueHandler.currentLiftLevel);
				QueueHandler.removeLiftStoppages(finalFloorToGoInMovingDirection);
			}
		}
	}
}