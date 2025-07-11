package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.service.StudentService;

@Controller

public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String laodIndexPage(Model model) {

		formInitBinding(model);

		return "index";

	}

	private void formInitBinding(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("Courses", service.getCourses());
		model.addAttribute("PrefTimings", service.getTimings());
	}

	@PostMapping("/save")
	public String saveStudent(Student s, Model model) {

		boolean issaved = service.saveStudent(s);
		if (issaved) {
			model.addAttribute("msg", "Data saved..");

		}

		formInitBinding(model);
		return "index";

	}

}
