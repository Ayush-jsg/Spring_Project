package com.monu;

public class CreditCardPayment implements Ipayment {

	@Override
	public boolean processPayment(double billAmount) {
		System.out.println("Credit card payment processed.....");
		return true;
	}

}
