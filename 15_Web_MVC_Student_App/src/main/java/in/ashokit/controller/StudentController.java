package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.binding.Student;

@Controller
public class StudentController {

	@GetMapping("/")
	public String LoadIndexPage(Model model) {

		model.addAttribute("student", new Student());

		return "index1";

	}

}
