package com.tt.sesha;

public class KiaManualCarsLamda {
	
	public static void main(String [] args) {
		
		//Ananymous 
		
	ManualCars mc =	new ManualCars() {

			@Override
			public void gearSystem(String str) {
				System.out.println(str);
				
			}
			
		};
		
		
		mc.gearSystem("Ananymous functions -Manual cars");
		ManualCars obj =(str)->{ 
		System.out.println(str);
				
		} ;	
		obj.gearSystem("This is Manual Cars");
		}

}
