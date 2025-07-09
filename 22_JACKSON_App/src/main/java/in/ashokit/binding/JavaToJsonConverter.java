package in.ashokit.binding;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {

		Address addr = new Address();
		addr.setCity("hyd");
		addr.setState("TG");
		addr.setCountry("india");

		Customer c = new Customer();
		c.setId(1);
		c.setName("Robot");
		c.setGmail("robot@gmail.com");
		c.setPno(99989702l);
		c.setAddr(addr);

		//converting java obj to json
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("Customer.json"), c);
		System.out.println("json file created");

	}

}
