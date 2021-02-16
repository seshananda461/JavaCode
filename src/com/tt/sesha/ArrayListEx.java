package com.tt.sesha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListEx {
	
	public static void main(String [] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("sesha Yaparla");
		list.add("santhosh pannuru");
		list.add("pruthvi cittla");
		list.add("mohan gouram");
		list.add("abhi Mandli");
		list.add("jagadeesh Mandli");
		
		list.forEach(str->
		{
			if(str.contains("Mandli"))
			{
				System.out.println(str);
			}
			});
		
		Map<String,Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("E", 5);
		map.put("J", 10);
		map.put("L", 12);
		
		map.forEach((k,v)->{
			System.out.println("key:"+k+"value:"+v);
		});
		};
	}


