package com.tt.sesha;

public class MthodRef {
	
	MthodRef(){
		System.out.println("Constructor");
	}
	
	public static void getCarImp() {
		System.out.println("This is a Automatic Car");
	}
	
	public  void testMethod() {
		System.out.println("This is a test Car");
	}
	
	public static void main(String [] args) {
//		MthodRef obj = new MthodRef();
		AutomaticCars ref = MthodRef::new;
		ref.automatic();
		}

}
