package in.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MsgController {

	@GetMapping("/")
	public String msg(Model model) {
		model.addAttribute("msg", "Good Evening..");
		return "index";

	}

	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		String msg = "Hello ,how are you";
		return msg;
	}

}
