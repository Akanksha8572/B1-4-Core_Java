package com.tns.framwork;

public abstract class ShopFactory
{
	abstract PrimeAcc getNewPrimeAccount(int accNo,String accNm, float charge,boolean isPrim);
	abstract NormalAcc getNewNormalAccount(int accNo,String accNm, float deliverycharges,float charges);

}
