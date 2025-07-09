package in.ashokit.binding;

import java.io.Serializable;

import lombok.Data;

@Data
public class Country implements Serializable{
	
	public Integer sno;
	public String name;
	public String countrycode;

}
