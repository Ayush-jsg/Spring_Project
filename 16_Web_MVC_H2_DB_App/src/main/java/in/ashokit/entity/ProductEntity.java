package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductEntity {
	
	@Id
	@GeneratedValue
	private Integer pid;
	private String name;
	private Double price;
	private Long  quantity;

}
