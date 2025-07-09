package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Book;

@RestController
public class BookRestController {

	@PostMapping(value = "/book", consumes = "application/json")
	public ResponseEntity<String> addBook(@RequestBody Book b) {
		System.out.println(b);
		String msg = "Saved Record";
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/book", produces = "application/json")

	public Book getBook() {

		Book b = new Book();
		b.setId(101);
		b.setName("Java");
		b.setPrice(130.00);

		return b;

	}

}
