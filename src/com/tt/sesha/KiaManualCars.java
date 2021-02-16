package com.tt.sesha;

public class KiaManualCars implements ManualCars{

	@Override
	public void gearSystem() {
		System.out.println("Manual Cars");
		
	}
	public static void main(String [] args) {
		KiaManualCars obj = new KiaManualCars();
		obj.gearSystem();
	}
	
		
	}
