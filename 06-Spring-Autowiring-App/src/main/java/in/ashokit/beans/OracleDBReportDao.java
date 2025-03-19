package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository("oracle dao")
public class OracleDBReportDao implements ReportDao {

	public void getData() {
		System.out.println("getting data from oracle db......");
	}

}
