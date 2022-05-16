package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
//import com.tns.application.GSShopFactory;
import com.tns.framwork.NormalAcc;
import com.tns.framwork.PrimeAcc;
//import com.tns.framwork.ShopFactory;
import com.tns.framwork.ShopAcc;

public class Client {

	public static void main(String[] args) {
		//ShopFactory obj=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(153,"Akanksha",0.0f,true);
		NormalAcc n=new GSNormalAcc(144,"Ashtha",10f,300f);
		System.out.println("Prime account ");
		p.bookProduct(ShopAcc.getCharge());
		System.out.println("Normal account");
		n.bookProduct(ShopAcc.getCharges());
		System.out.println();
		System.out.println(p);
		System.out.println(n);
		}

	

	}


