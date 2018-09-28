package com.dp.adapter;

public class AppleAdapter implements Chargeable{

	Charger samsungCharger;
	
	
	public void setSamsungCharger(Charger samsungCharger) {
		this.samsungCharger = samsungCharger;
	}

	@Override
	public void setMobileName(String mobileName) {
		// Keep it empty
	}
	
	//When we call charger method.
	//it internally calls supplyCharger method
	@Override
	public void charge() {

		samsungCharger.supplyCharge();
	}


}
