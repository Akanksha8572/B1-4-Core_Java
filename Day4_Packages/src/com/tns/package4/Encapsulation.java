package com.tns.package4;

import com.tns.package3.SBI;

public class Encapsulation 
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		s.setBalance(2500000);
		System.out.println("your SB a/c Balance:"+s.getBalance());

	}

}
