package com.tns.application;


import com.tns.framwork.ShopFactory;

public abstract class GSShopFactory extends ShopFactory
{
	
	public GSPrimeAcc getNewPrimeAcc(int accNo,String accNm, float charges,boolean isPrime) 
	{
		return null;
	}
	


	public GSNormalAcc getNewPrimeAcc(int accNo,String accNm, float charges,float deliverycharges) 
	{
		return null;
	}



}
