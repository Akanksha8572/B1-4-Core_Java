package com.tns.framwork;

public abstract class ShopAcc
{
	private static int accNo;
	private static String accNm;
	private static float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		
		ShopAcc.accNo = accNo;
		ShopAcc.accNm = accNm;
		ShopAcc.charges = charges;
	}  
	public abstract void bookProduct (float charges);
	public abstract void iteam(float charges);
	public static int getAccNo() {
		return accNo;
	}
	
	public static String getAccNm() {
		return accNm;
	}
	public static void setAccNm(String accNm) {
		ShopAcc.accNm = accNm;
	}
	public static float getCharges() {
		return charges;
	}
	public static float getCharge() {
		return charges;
	}
	@Override
	public String toString() {
		return "ShopeAcc[accNo="+accNo+",accNm="+accNm+",charges="+charges+"]";
	}
	
}

