package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepositry;

@Controller

public class ProductController {

	@Autowired
	private ProductRepositry repo;

	@GetMapping("/products")
	public String loadProducts(Model model) {
		model.addAttribute("products", repo.findAll());

		return "data";

	}

	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("p", new Product());
		return "index";

	}

	public String handlesave(Product p, Model model) {
		repo.save(p);
		if (p.getPid() != null) {
			model.addAttribute("msd", "product saved ");

		}
		return "index";

	}

}
