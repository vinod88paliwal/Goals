package com.dp.adapter;

public class AdapterPatterTest {

	public static void main(String[] args) {

		Chargeable appleCharger = new AppleCharger();
		appleCharger.setMobileName("IPhone 6");
		
		ChargerUtils.doCharge(appleCharger);
	
	
		Charger samsungCharger = new SamsungCharger();
		samsungCharger.setMobileName("Galaxy Note 4");
	
	AppleAdapter appleAdapter = new AppleAdapter();
	appleAdapter.setSamsungCharger(samsungCharger);
	
	ChargerUtils.doCharge(appleAdapter);
	
	
	
	}
	

}
