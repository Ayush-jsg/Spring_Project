package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		UserDao dao = ctx.getBean(UserDao.class);
		dao.getData();	

	}

}
