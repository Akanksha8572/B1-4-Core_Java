package com.tns.lambda;

interface E
{
	int add(int x, int y);
}


public class Lambda6 {

	public static void main(String[] args) {
		//lambda expression without return keyword 
		E obj = (x,y)->(x+y);
		System.out.println(obj.add(100, 1000));

	}

}
