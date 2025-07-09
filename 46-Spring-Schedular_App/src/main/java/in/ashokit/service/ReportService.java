package in.ashokit.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	@Scheduled(cron = "0 * * * * *")
	public void generateReport() {
		
		System.out.println("Report Generated..  OF EMPLOYEE");
		
	}

}
