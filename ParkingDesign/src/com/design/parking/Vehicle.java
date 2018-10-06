package com.design.parking;

public abstract class Vehicle {
	
	//int charges;
	String noPlate;
	enum color{RED, BLUE,WHITE,GREEN,YELLOW};
	enum vehicles {BIKE, CAR, BIGCAR, BUS};

	public abstract long getCarges();
}
