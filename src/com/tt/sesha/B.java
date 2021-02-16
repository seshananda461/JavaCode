package com.tt.sesha;

public class B implements InterfaceOne {
	@Override
	public void testMethod() {
		System.out.println("Class B");
	}

	@Override
	public void testMethod2() {
		System.out.println("---default method---");
		
	}
	public static void main(String [] args) {
		B b = new B();
		b.testMethod();
		b.testMethod2();
	}

}
