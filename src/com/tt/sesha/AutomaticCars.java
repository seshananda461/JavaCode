package com.tt.sesha;

@FunctionalInterface 
public interface AutomaticCars {

	 void automatic();
	 
	 default void testMethod() {
		 System.out.println("Default Method");
	 }
	 
	 static void test() {
		 System.out.println("static method");
	 }
}
 