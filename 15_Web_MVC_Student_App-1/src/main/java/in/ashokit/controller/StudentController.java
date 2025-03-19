package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.entity.StudentEntity;

@Controller

public class StudentController {
	@GetMapping("/")
	public String laodIndexPage(Model model) {
		
		model.addAttribute("student", new StudentEntity());
	   
		return "index";
		
	}

}
