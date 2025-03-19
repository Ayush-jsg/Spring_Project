package com.monu;

public class SodexoPayment implements Ipayment {

	@Override
	public boolean processPayment(double billAmount) {
		System.out.println("Sodexo Payment processed....");
		return true;
	}

}
