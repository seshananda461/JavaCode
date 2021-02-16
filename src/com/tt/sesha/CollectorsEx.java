package com.tt.sesha;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsEx {
 
	public static void main(String [] args) {
		List<String> list = new ArrayList<>();
		list.add("sesha Yaparla");
		list.add("santhosh pannuru");
		list.add("pruthvi cittla");
		list.add("mohan gouram");
		list.add("abhi Mandli");
		list.add("jagadeesh Mandli");
		
		ArrayList<String> mainList = new ArrayList<>();
		for(String str :list)
		{
			if(str.contains("Mandli"))
			{
				System.out.println(str);
				mainList.add(str);
			}
			}
		list.stream().forEach(str->{
			if(str.contains("Mandli")) {
				System.out.println(str);
			}
		});
		List name = list.stream().filter(str->str.contains("Mandli")).collect(Collectors.toList());
	System.out.println(name);
	}
}
