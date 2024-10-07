package com.exampleMongoDB.grocery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("groceryitems")
public class GroceryItem {
	
	@Id
	private String id;
	
	@Indexed
	@NotBlank
	private String name;
	
	@Field("quantity")
	@NotNull
	private Integer quantity;
	
	private String category;
	
}
