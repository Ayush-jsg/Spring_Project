package in.ashok;

public class CreditCardPayment implements Ipayment {
	
	public CreditCardPayment(){
		System.out.println("CreditCardPayment :: constructor");
	} 

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("CreditCard Payment Sucessfull....");
		return true;
	}

}
