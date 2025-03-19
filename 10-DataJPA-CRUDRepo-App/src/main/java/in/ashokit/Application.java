package in.ashokit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);

		/*
		 * Book b = new Book(); b.setBookid(103); b.setBookname("Angular");
		 * b.setBookprice(8000.00); repo.save(b);
		 */

		Book b1 = new Book();
		b1.setBookid(104);
		b1.setBookname("Hibernate");
		b1.setBookprice(12000.00);

		Book b2 = new Book();
		b2.setBookid(105);
		b2.setBookname("React js");
		b2.setBookprice(15000.00);

		repo.saveAll(Arrays.asList(b1, b2));

		System.out.println("Record inserted....");
	}

}
