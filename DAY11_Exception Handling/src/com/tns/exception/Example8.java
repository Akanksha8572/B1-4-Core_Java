package com.tns.exception;

public class Example8 {

	public static void main(String[] args)
	{
		System.out.println(Example8.myMethod());
		
	}
	public static int myMethod() {
		try {
			int x=63;
			int y=0;
			int z=x/y;
		}
		catch (Exception exp) {
			System.out.println(exp);
		}
		finally {
			System.out.println("Java finally block");
			return 0;
		}
	}

}
