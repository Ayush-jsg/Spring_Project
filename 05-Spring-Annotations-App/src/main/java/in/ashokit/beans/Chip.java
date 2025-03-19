package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	
	public Chip() {
		System.out.println("chip::constructor");
	}
	
	
	public String chipType(){
		return "32-Bit";
	}

}
