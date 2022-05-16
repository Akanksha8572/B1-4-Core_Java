package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class client {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		BankFactory obj=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(203, "Akanksha", 1000, true, 10);
		CurrentAcc c=new MMCurrentAcc(152, "Ramesh", 1000.0f, 100.0f);
		System.out.println("Saving Account: ");
		s.withdraw(350.0f);
		System.out.println();
		System.out.println("Current Account: ");
		c.withdraw(400.0f);
		System.out.println();
		
		System.out.println(s);
		System.out.println(c);
	}
}
