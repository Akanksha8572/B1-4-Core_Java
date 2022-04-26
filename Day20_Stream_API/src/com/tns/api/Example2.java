package com.tns.api;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		List<Integer>values=Arrays.asList(11,22,33,60,2,44,60,100,4,6,6,4);
		values.stream().filter(i->i<20).forEach(i->System.out.println(i));
		values.stream().distinct().forEach(i->System.out.println("Unique values are" +i));
		values.stream().sorted().forEach(i->System.out.println(i));
	


	}

}
