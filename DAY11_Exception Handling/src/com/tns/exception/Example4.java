package com.tns.exception;


public class Example4 {

	public static void main(String[] args) 
	{
		System.out.println("First line");
		System.out.println("Second line");
		try 
		{
			int[] myIntArray = new int[] {1,2,3};
			println(myIntArray);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array does not have fourth element");
		}
		System.out.println("Third line");
	}
	public static void println(int[] arr) {
		System.out.println(arr[4]);
		}
		
		

	}


