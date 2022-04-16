package com.tns.strings;

public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("vikky");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.setCharAt(1,'e');
		System.out.println(sb);
		System.out.println(sb.charAt(1));
	}

}