package com.dp.adapter;

public class SamsungCharger implements Charger{

	String mobileName;
	
	@Override
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	//The only difference is with interface method.
	@Override
	public void supplyCharge() {
		System.out.println("Charging "+this.mobileName+" ...");		
	}

}
