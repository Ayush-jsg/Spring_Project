package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@NotBlank(message ="Name is mandatory")
	@Size( min = 3,max = 15, message="Name should have only 2 to 15 charactor")
	private String name;
	
	@NotNull(message ="price is mandatory")
	@Positive(message="price should positive number")
	private Double price;
	
	@NotNull(message ="Quantity is mandatory")
	@Positive(message="Qty should positive number")
	private Integer qty;

}
