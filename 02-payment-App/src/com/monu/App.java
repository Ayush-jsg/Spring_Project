package com.monu;

public class App {
	public static void main(String[] args) {

		//Ipayment p = new DebitCardPayment();
		//Ipayment p = new CreditCardPayment();
		Ipayment p = new SodexoPayment();

		PaymentService service = new PaymentService(p);
		service.dopayment(1000);
	}

}
