package in.ashokit.beans;

public class Car {

	private IEngine eng;

	public Car() {
		System.out.println("Car:: constructor");
	}

	public void setEng(IEngine eng) {
		this.eng = eng;
	}

	public void drice() {
		int status = eng.start();
		if (status >= 1) {
			System.out.println("journey started....");
		} else {
			System.out.println("Engine trouble....");
		}
	}

}
