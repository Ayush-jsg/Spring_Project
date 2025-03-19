package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/Welcome")
	public ModelAndView getwelcomeMsg() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("Msg", "Welcome to Ashokit..!!");

		mav.setViewName("Message");

		return mav;

	}

	@GetMapping("/Greet")
	public ModelAndView getGreetMsg() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("Msg", "Good Evening...!!");

		mav.setViewName("Message");

		return mav;

	}

}
