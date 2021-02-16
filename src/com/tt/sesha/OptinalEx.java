package com.tt.sesha;

import java.util.Optional;

public class OptinalEx {
	
	public static void main(String [] args) {
//		Optional<String> str = Optional.of(null);
//		System.out.println(str);
		
		String[] strArr =new String[10];
		Optional <String> opt = Optional.ofNullable(strArr[9]);
		if(opt.isPresent()) {
			String result = opt.get().substring(1, 3);
			System.out.println(result);
		}
		else {
			System.out.println(" Value is null");
		}
		strArr[9] = "sesha nanda Reddy ";
		Optional <String> value = Optional.ofNullable(strArr[9]);
		if(value.isPresent()) {
			String result = value.get().substring(1, 4);
			System.out.println(result);
		}
		else {
			System.out.println(" Value is null");
		}
		
		System.out.println(value.get().substring(0, value.get().indexOf(" ")));
		System.out.println(value.get().substring( value.get().lastIndexOf(" ")));
		
		opt.ifPresent(s->System.out.println("value is present"));
		value.ifPresent(s->System.out.println("value is in another array"));
		
		Optional<String>  GOT =  Optional.of("YSR");
		Optional<String> nothing =  Optional.empty();
		
		System.out.println(nothing.orElse("It is empty"));
		System.out.println(nothing.orElseGet(() -> "Sesha"));
		
		Optional<String> response = GOT.map(String::toLowerCase);
		response.ifPresent(s -> System.out.println(s));
		}
}
