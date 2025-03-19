package com.monu;

public class PaymentService {

	private Ipayment payment;

	public PaymentService(Ipayment payment) {
		this.payment = payment;
	}

	public void dopayment(double billAmount) {
		boolean status = payment.processPayment(billAmount);
		if (status) {
			System.out.println("printing reciept...");
		} else {
			System.out.println("payment Declined");
		}

	}

}
