package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	
	@Id
	private Integer bookid;
	private String bookname;
	private Double bookprice;

}
