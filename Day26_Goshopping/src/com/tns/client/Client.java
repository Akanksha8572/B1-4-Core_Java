package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;

import com.tns.framwork.NormalAcc;
import com.tns.framwork.PrimeAcc;

public class Client {

	public static void main(String[] args) {
		//ShopFactory obj=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(203,"Akanksha",1234,true);
		NormalAcc n=new GSNormalAcc(420,"Anushka",3000,10);
		System.out.println("Prime account ");
		p.bookProduct(p.getCharge());
		System.out.println("Normal account");
		n.bookProduct(n.getCharges());
		System.out.println();
		System.out.println(p);
		System.out.println(n);
		}

}


