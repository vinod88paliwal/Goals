package com.lalit.elevator.implementation;

public class Requests {

	public final int requestingFloor;
	public final String directionToGo;
	public int floorToGo;

	public Requests(int requestingFloor, String directionToGo, int floorToGo) {
		super();
		this.requestingFloor = requestingFloor;
		this.directionToGo = directionToGo;
		this.floorToGo = floorToGo;
	}
}
