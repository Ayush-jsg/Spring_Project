package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AccountRepo bean = context.getBean(AccountRepo.class);

		AccountPK pk = new AccountPK();
		pk.setAccNum(12345678912l);
		pk.setAccType("Savings");

		Account acc = new Account();
		acc.setHolderName("Monu");
		acc.setBranch("Ameerpet");
		acc.setAccountpk(pk);

		bean.save(acc);
		System.out.println("Record saved......");

	}

}
