package com.tns.framwork;

public abstract class NormalAcc extends ShopAcc
{
	private static float deliverycharges;
	
	
	
	public NormalAcc(int accNo,String accNm, float deliverycharges,float charges) {
		
		super(accNo,accNm,charges);
		NormalAcc.deliverycharges=deliverycharges;
	}
	
	
	public static float getDeliverycharges() {
		return deliverycharges;
	}


	@Override
	public String toString() {
		return "NormalAcc[getcharges()="+getCharges()+"getDeliveryCharges"+getDeliverycharges()+",toString()="+super.toString()+"]";

}
}
