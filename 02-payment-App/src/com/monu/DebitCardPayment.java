package com.monu;

public class DebitCardPayment implements Ipayment {

	@Override
	public boolean processPayment(double billAmount) {
		System.out.println("Debit card payment processed.....");
		return true;
	}

}
