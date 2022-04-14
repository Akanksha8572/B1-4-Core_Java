package com.tns.exception;
import java.io.*; 

public class Example12 {
	void myMethod(int num)throws IOException,
	ClassNotFoundException{
		if(num==1)
			throw new IOException("IOException Occurred");
		else
			throw new 
			ClassNotFoundException("ClassNotFoundException");
	}
	 


	public static void main(String[] args) {
		try {
			Example12 obj=new Example12();
			obj.myMethod(1);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		

	}

}
