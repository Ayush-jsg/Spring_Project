package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		/*
		 * Employee e1 = new Employee(2, "smith", 15000.00, "Male", "Sales"); Employee
		 * e2 = new Employee(3, "Chales", 25000.00, "Male", "Account"); Employee e3 =
		 * new Employee(4, "Devid", 35000.00, "Male", "Marketing"); Employee e4 = new
		 * Employee(5, "perry", 45000.00, "Fe-Male", "Hr"); Employee e5 = new
		 * Employee(6, "Head", 55000.00, "Male", "Manager"); Employee e6 = new
		 * Employee(7, "convey", 65000.00, "Male", "Admin");
		 * 
		 * repository.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6));
		 * 
		 * System.out.println("Record saved...");
		 */

		Sort sort = Sort.by("empName").ascending();

		List<Employee> emp = repository.findAll(sort);

		emp.forEach(System.out::println);
	}

}
