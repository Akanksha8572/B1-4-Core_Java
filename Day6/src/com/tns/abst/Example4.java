package com.tns.abst;

class Persan 
{
	String name="Shagun";
}
class child extends Persan
{
	String name="Amrisha";
	void print()
	{
		System.out.println("Hi I am "+name);
		System.out.println("Hi I am "+super.name);
	}
}

public class Example4 {

	public static void main(String[] args) {
		
		{
			child b=new child();
			b.print();
		}

	}

}