package com.tns.exception;

public class Example7 {

	public static void main(String[] args)
	{
		System.out.println(Example7.myMethod());
	}
	public static int myMethod() {
		try {
			int x = 63;
			int y = 9;
			int z=x/y;
			
			System.out.println("Inside try block");
			System.exit(0);
		}
		catch (Exception exp) {
			System.out.println(exp);
		}
		finally {
			System.out.println("Java finally block");
			return 0;
		}
		}
	private static void println(int z) {
		// TODO Auto-generated method stub
		
	}
	
	}

		
	
		

	


