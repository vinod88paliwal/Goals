package com.design.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Bike extends Vehicle {
	private int charges = 10;
	LocalDateTime dateTime;
	
	public Bike(vehicle v , color c , String np,LocalDateTime dateTime) {

		noPlate = np;
	}
	public long getCarges()
	{
		LocalDateTime now = LocalDateTime.now();
		long hrs = Duration.between(dateTime, now).toHours();
		long charge = charges * hrs;
		
		return charge;
	}
}
