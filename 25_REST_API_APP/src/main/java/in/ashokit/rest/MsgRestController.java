package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg() {
		String response = "msg saved sucessfully";
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg = "Welcome to REST API..!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Evening";
	}

}
