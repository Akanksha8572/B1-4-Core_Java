package com.tns.strings;

import java.util.StringTokenizer;
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st3 = new StringTokenizer("Akanksha:singh", ":",true);
		while(st3.hasMoreTokens())
		System.out.println(st3.nextToken());
	
	}

}
