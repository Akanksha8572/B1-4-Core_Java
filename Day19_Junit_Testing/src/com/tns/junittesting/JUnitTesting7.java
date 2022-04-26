package com.tns.junittesting;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitTesting7 {
	@BeforeAll   
	static void display()
	{
		System.out.println("Anjali");
	}
	@Test
	void display1()
	{
		System.out.println("Anamika");
	}
}