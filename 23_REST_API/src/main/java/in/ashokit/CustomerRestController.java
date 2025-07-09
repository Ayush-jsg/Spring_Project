package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Customer;

@RestController
public class CustomerRestController {

	@GetMapping("/")
	public Customer getcustomer() {
		Customer c = new Customer();
		c.setId(1);
		c.setName("Robot");
		c.setGmail("robot@gmail.com");
		c.setPno(99989702l);

		return c;

	}

}
