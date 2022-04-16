package com.tns.strings;

import java.util.StringTokenizer;
public class Example6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st3 = new StringTokenizer("Java:CodeString:code", ":", false);
		while(st3.hasMoreTokens())
		System.out.println(st3.nextToken());
			
	}
		
	}