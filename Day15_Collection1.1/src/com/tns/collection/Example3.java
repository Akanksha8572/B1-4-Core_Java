package com.tns.collection;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<Double> obj=new ArrayList<>(2);
		obj.add(10.0);
		obj.add(1.0);
		obj.add(100.0);
		obj.add(22.0);
		obj.add(22.0);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(100.0));
		System.out.println(obj.indexOf(100.0));
		System.out.println(obj.lastIndexOf(22.0));
		System.out.println(obj.get(3));
		obj.set(3,1999.0);
		System.out.println(obj);
		
		System.out.println(obj.isEmpty());

	}



	}
