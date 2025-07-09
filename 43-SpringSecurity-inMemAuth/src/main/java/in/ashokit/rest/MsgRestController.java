package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/contact")
	public String contact() {
		return "contact us :: 9199860101";
	}

	@GetMapping("/greet")
	public String greetMsg() {
		return "Good Evening..";
	}

	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to our App..";
	}

}
