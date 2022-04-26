package com.tns.junittesting;

import org.junit.jupiter.api.Assumptions;

public class JUnitTesting8 {
	void accept()
	{
		System.setProperty("10", "nikita");
		Assumptions.assumeTrue("nikita".equals(System.getProperty("2")));
		
		 
	}
}


