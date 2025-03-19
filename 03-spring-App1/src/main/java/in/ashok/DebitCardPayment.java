package in.ashok;

public class DebitCardPayment implements Ipayment {
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: constructor");
		
	}

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("DebitCard Payment Sucessfull..");
		return true;
	}

}
