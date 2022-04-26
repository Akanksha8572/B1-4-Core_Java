package com.tns.junittesting;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.Test;

public class JUnitTesting9 { 
	@AfterAll   
	static void display()
	{
		System.out.println("Sonu");
	}
	@Test
	void display1()
	{
		System.out.println("Jay");
	}
}