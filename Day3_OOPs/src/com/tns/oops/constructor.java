package com.tns.oops;

public class constructor {

	
	String str;
	int a;
	constructor(String st,int x)
	{
		str=st;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
	}
		public static void main(String[] args) 
		{
			constructor c=new constructor("welcome",11);
			constructor c1=new constructor("Akanksha",22);
			c.display();
			c1.display();
			
		}

	}
