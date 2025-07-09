package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient feignclient;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		 String greetResp = feignclient.invokeGreetApi();

		return greetResp + " , Welcome To Ashok IT";
	}

}
