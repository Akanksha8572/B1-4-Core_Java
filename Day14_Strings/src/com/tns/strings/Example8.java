package com.tns.strings;

import java.util.StringTokenizer;
public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("Akanksha,shagun,vishal,vaishnvi,rudra",",");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}


