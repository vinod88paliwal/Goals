package com.lalit.elevator.implementation;

/*
 * 
 * Button press by People will act as producer event for the lift 
 * 
 * */
public class Producer implements Runnable {
	public Producer() {
		Thread producer = new Thread(this);
		producer.start();
	}

	public void run() {
		int counter = 0;
		while (true && counter < 3) {

			// Scenario 1 All requests served in single go upward

			// int[] array_level_button_press_outside_lift = { 6, 1, 3, 5 };
			// String[] direction_requested = { "Down", "Up", "Up", "Up" };
			// int[] array_level_button_press_inside_lift = { -3, 2, 4, 6 };

			// Scenario 2 All requests served in single go downward

			// int[] array_level_button_press_outside_lift = { -3, -1, -2 };
			// String[] direction_requested = { "Up", "Down", "Down" };
			// int[] array_level_button_press_inside_lift = { 4, -3, -3 };

			// Scenario 3

			int[] array_level_button_press_outside_lift = { 6, 1, 4, 5, 7, 9, 11 };
			String[] direction_requested = { "Down", "Up", "Up", "Up", "Up", "Up", "Down" };
			int[] array_level_button_press_inside_lift = { -3, 2, 10, 14, 10, 12, 3 };

			for (int i = 0; i < array_level_button_press_inside_lift.length; ++i) {
				System.out.println("\bPerson from level " + array_level_button_press_outside_lift[i] + " Requested for "
						+ direction_requested[i] + " direction");
				QueueHandler.enqueue(buildRequestObjectFromUserInput(array_level_button_press_outside_lift[i],
						direction_requested[i], array_level_button_press_inside_lift[i]));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				++counter;
			}
		}
	}

	private Requests buildRequestObjectFromUserInput(int requestingFloor, String direction, int finalDirection) {
		return new Requests(requestingFloor, direction, finalDirection);

	}
}