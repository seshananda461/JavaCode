package com.tt.sesha;

import java.util.Arrays;

public class ArraySortEx {

	 public static void main(String [] args) {
		 String[] strings = new String[] { "learning", "java", "with", "TrendinTech" };
		  
		 Arrays.parallelSort(strings);
		 
		 Arrays.stream(strings).forEach(s->System.out.println(s));
	 }
}
