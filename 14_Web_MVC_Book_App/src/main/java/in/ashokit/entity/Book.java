package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data 
public class Book {
	
	@Id
	private Integer BookId;
	private String  BookName;
	private Double   BookPrice;

}
