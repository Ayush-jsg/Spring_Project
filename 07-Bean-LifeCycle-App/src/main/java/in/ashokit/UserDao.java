package in.ashokit;

public class UserDao {
	
	public void init() {
		System.out.println("gatting db connection...");
	}
	public void getData() {
		System.out.println("getting data from db....");
	}
	
	public void Destroy() {
		System.out.println("closing db connection...");
	}

}
