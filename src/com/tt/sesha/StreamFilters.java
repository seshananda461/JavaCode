package com.tt.sesha;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilters {
	
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("sesha Yaparla");
		list.add("santhosh pannuru");
		list.add("pruthvi cittla");
		list.add("mohan gouram");
		list.add("abhi Mandli");
		list.add("jagadeesh Mandli");
		
		
		
		
		List<String> resultList =  list.stream().filter(str->str.contains("Mandli")).collect(Collectors.toList());
		System.out.println(resultList);
		
		//list1
		List<String> alphabets = new ArrayList<>(Arrays.asList("A","B","C"));
		
		//list2
				List<String> namess = Arrays.asList("Sesha","santosh","surya");
				
//				alphabets.addAll(namess);
//				System.out.println(alphabets);
				
				Stream<String> resultStream = Stream.concat(alphabets.stream(),namess.stream());
//				resultStream.filter(str->str.length()<6).collect(Collectors.toList());
				resultStream.forEach(str->System.out.println(str));
				}

}
