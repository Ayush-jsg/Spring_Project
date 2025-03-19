package in.ashok;

public class PaymentService {
	private Ipayment payment;

	public PaymentService(Ipayment payment) {
		this.payment = payment;
	}

	public void setPayment(Ipayment payment) {
		System.out.println("Setter method called ....");
		this.payment = payment;
	}

	public void doPayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		if (status) {
			System.out.println("reciept printing...");

		} else {
			System.out.println("payment declined...");
		}
	}
}
