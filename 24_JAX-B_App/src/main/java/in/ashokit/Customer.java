package in.ashokit;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Customer {
	private Integer id;
	private String name;
	private String gmail;
	private Long pno;

}
