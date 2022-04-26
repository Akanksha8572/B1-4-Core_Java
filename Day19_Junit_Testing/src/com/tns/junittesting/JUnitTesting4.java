package com.tns.junittesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class JUnitTesting4 
{
	@AfterAll
	static void display()
	{
		System.out.println("Akanksha");;
	}
	
	@Test 
	void display1 ()
	{
		System.out.println("Akku");
	}
	

}
