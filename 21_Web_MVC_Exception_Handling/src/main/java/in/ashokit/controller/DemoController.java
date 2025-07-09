package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public String getMsg(Model model) {

		String msgTxt = "Good Evening !!";
		model.addAttribute("msg", msgTxt);
		return "index";
	}

	@GetMapping("/wish")
	public String getwishMsg(Model model) {

		String msgTxt = "Good Evening !!";
		String s = null;
		s.length();
		model.addAttribute("msg", msgTxt);
		return "index";
	}

}
