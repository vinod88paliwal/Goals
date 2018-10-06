package com.design.parking;

import java.util.*;

import com.design.parking.Vehicle.color;
import com.design.parking.Vehicle.vehicles;

public class ParkingSlot {
	private volatile int bikeSlotNo;
	private volatile int carSlotNo;
	private volatile int bigCarSlotNo;
	private volatile int busSlotNo;
	
	private int MAX_SIZE;
	private Map<vehicles,Integer> lotsMap = new HashMap<>();
	private Map<Integer, vehicles> parkedMap = new HashMap<>();
	
	
	public void createParkingLot(int lotCount) {
		MAX_SIZE =lotCount;
		lotsMap.put(vehicles.BIKE, 10);
		lotsMap.put(vehicles.CAR, 10);
		lotsMap.put(vehicles.BIGCAR, 10);
		lotsMap.put(vehicles.BUS, 10);
		
		 System.out.println("Created parking lot with " + lotCount + " slots");
	}
	
	public void park(String noPlate, vehicles v, color c) 
	{
			int slotSize = lotsMap.get(v);
			
			if(slotSize >0)
			{
				Vehicle veh = createVehicle(noPlate,  v, c);
				parkedMap.put(carSlotNo++, veh);
				
				lotsMap.computeIfPresent(v, (key,val) -> val-1);
				 System.out.println("Allocated slot number: " + carSlotNo);
				 System.out.println("Map : "+lotsMap);
			}
			else
				System.out.println("Parking is Full");
		
		
	}
	
	
	private Vehicle createVehicle(String noPlate, Vehicle v, color c) {
		
		Vehicle vehcle = null;
		
		switch (v) {
		case CAR:
				vehcle = new Car(v, c, noPlate);
			break;
		case BIKE:
			vehcle = new Bike(v, c, noPlate);
		break;

		case BIGCAR:
			vehcle = new BigCar(v, c, noPlate);
		break;

		case BUS:
			vehcle = new Bus(v, c, noPlate);
		break;

		}
		return vehcle;
	}

	public void remove(String slotNo) {
		
	}
}
