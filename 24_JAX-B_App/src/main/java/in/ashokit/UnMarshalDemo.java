package in.ashokit;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UnMarshalDemo {

	public static void main(String[] args) throws Exception {

		File f = new File("customer.xml");

		JAXBContext context = JAXBContext.newInstance(Customer.class);

		Unmarshaller unmarsh = context.createUnmarshaller();

		Object obj = unmarsh.unmarshal(f);
		Customer c = (Customer) obj;
		System.out.println(c);
	}

}
