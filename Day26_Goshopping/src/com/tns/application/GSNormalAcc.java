package com.tns.application;

import com.tns.framwork.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accNo, String accNm, float deliverycharges, float charges) {
		super(accNo, accNm, deliverycharges, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float charges) {
		float charges1=charges+NormalAcc.getDeliverycharges(); 
		System.out.println("Account No"+NormalAcc.getAccNo()+"\n"+"Account Name: "+NormalAcc.getAccNm()+"\n"+"Charges: "+NormalAcc.getCharge()+"\n"+"Delivery charges"+NormalAcc.getCharges());

		
	}

	@Override
	public void iteam(float iteam_id) {
		System.out.println();
		
	}
	@Override
	public String toString() {
		return "GSPrimeAcc[toString()="+super.toString()+",getCharges()="+getCharges()+"]";
	

}
}
