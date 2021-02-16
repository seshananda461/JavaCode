package com.tt.sesha;

public interface InterfaceOne {
	
	  void testMethod();
	  
	  default void testMethod2() {
		  System.out.println("---default method--");
	  }
	  static void staticMethod()
	  {
		  System.out.println("...static method...");
	  }

}
