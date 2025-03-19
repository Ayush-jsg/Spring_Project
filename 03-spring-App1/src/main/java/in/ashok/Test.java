package in.ashok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("Beans.xml");
		
		
		PaymentService paymentService = context.getBean(PaymentService.class);

		paymentService.doPayment(199.00);

	}

}
