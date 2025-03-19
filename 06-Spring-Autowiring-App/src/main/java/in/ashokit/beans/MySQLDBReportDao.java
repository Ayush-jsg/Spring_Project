package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository("mysql dao")
public class MySQLDBReportDao implements ReportDao {
	
	public void getData() {
		System.out.println("getting data from mysql db ....");
	}

}
