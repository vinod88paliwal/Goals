package com.design.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Bus extends Vehicle {

	private int charges = 100;
	LocalDateTime dateTime;
	
	public Bus(vehicle v , color c , String noPlate) {

	}
	public long getCarges()
	{
		LocalDateTime now = LocalDateTime.now();
		long hrs = Duration.between(dateTime, now).toHours();
		long charge = charges * hrs;
		
		return charge;
	}

}
