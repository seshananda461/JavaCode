package com.tt.sesha;

public class A implements InterfaceOne{
	@Override
	public void testMethod() {
		System.out.println("Class A");
	}
	@Override
	public void testMethod2() {
		System.out.println("default method");
		
	}
	public static void main(String [] args) {
		A a = new A();
		a.testMethod();
		a.testMethod2();
	}

}
