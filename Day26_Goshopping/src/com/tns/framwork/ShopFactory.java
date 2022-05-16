package com.tns.framwork;

public abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAccount(int accNo,String accNm,float delivaryCharges,boolean b);
	public abstract NormalAcc getNewNormalAccount(int accNo,String accNm,float delivaryCharges,float charges);

}