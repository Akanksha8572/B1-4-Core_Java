package com.tns.lambda;

interface D
{
	String print(String message);
}

public class Lambda5 {

	public static void main(String[] args) {
		D obj=(String message)->
		{
			return message;
			//System.out.println("The name is "+message);
		};
		System.out.println("the name is:"+obj.print(" akanksha"));
	

	}

}
