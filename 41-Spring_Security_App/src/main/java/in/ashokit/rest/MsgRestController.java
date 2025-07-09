package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/login")
	public String login() {
		return "login page loading..";
	}
	
	
	@GetMapping("/contact")
	public String contact() {
		return "call us:: 9608597097";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi, How Are You?";
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, How are you?";
	}
	
	

}
