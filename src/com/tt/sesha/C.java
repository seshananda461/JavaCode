package com.tt.sesha;

public class C implements InterfaceOne{

	@Override
	public void testMethod() {
		System.out.println("Class C");
		
	}

	@Override
	public void testMethod2() {
		System.out.println("---Default Method---");
		
	}
	public static void main(String [] args) {
		C c = new C();
		c.testMethod();
		c.testMethod2();
	}
	

}
