package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		
		model.addAttribute("msg", "Welcome to Tymeleaf pages");
		
		return "index"; 
		
	}
	
	@GetMapping("/greet")
	public String getgreetMsg(Model model) {
		
		model.addAttribute("msg", "Good evening.......");
		
		return "index"; 
		
	}

}
