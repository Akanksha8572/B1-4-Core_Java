package com.tns.exception;

public class Example10 
{
	public static void validate(int age)
	{
		if (age<21 || age>27)
			throw new ArithmeticException("not eligible");
		else
			System.out.println("eligible to attend military Selection");
	
	}

	public static void main(String[] args) {
		validate(30);
		System.out.println("rest of the code ...");

	}

}
