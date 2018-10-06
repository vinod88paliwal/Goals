package com.design.parking;

import java.util.HashMap;
import java.util.Map;

import com.design.parking.Vehicle.vehicle;

public class Test {

	public static void main(String[] args) {
		
		Map<vehicle,Integer> lotsMap = new HashMap<>();
		lotsMap.put(vehicle.BIKE, 10);
		lotsMap.put(vehicle.CAR, 10);
		lotsMap.put(vehicle.BIGCAR, 10);
		lotsMap.put(vehicle.BUS, 10);
		
		lotsMap.computeIfPresent(vehicle.CAR, (key,val) -> val-1);
		 System.out.println("Map : "+lotsMap);
		
		
		
		
	}
	
}
