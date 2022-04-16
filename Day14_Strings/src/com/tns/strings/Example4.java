package com.tns.strings;

public class Example4 {

	public static void main(String[] args) {
		String str1 =new String("DHONI");
		String str2 =new String("DHONI");
		System.out.println(str1.equals(str2));
		if(str1.equals(str2))
		{
			System.out.println("marched");
		}
		else
		{
			System.out.println("not matched");
		}

	}

}
