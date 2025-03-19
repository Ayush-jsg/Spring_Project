package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	@Autowired
	@Qualifier("mysql dao")
	private ReportDao dao;

	public void generateReport() {

		dao.getData();
		System.out.println("Report generated...");

	}

}
