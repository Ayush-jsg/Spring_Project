package in.ashokit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class MarshalDemo {
	public static void main(String[] args) throws Exception {

		Customer c = new Customer();
		c.setId(101);
		c.setName("monu");
		c.setGmail("monu@123");
		c.setPno(989796l);

		JAXBContext context = JAXBContext.newInstance(Customer.class);

		Marshaller marsh = context.createMarshaller();
		marsh.marshal(c, new File("customer.xml"));
		
		System.out.println("xml created....");

	}

}
