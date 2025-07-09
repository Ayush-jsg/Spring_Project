package in.ashokit.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.User;

@RestController
public class UserRestController {

	public Map<Integer, User> dataMap = new HashMap<>();

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		System.out.println(user);
		dataMap.put(user.getId(), user);
		return new ResponseEntity<String>("user saved", HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{id}/data")
	public User getUser(@PathVariable("id")Integer userId) {
		
		 User user = dataMap.get(userId);
		 return user;
	}
	
	
	
	/*@GetMapping("/user")
	public User getUser(@RequestParam("userId")Integer userId) {
		
		 User user = dataMap.get(userId);
		 return user;
	}
	*/

}
