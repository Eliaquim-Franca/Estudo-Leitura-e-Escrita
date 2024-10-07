package com.exampleMongoDB.grocery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.exampleMongoDB.grocery.model.GroceryItem;


public interface ItemRepositoy extends MongoRepository<GroceryItem, String>{
	
	@Query("{name:'?0'}")
	GroceryItem findItemByName(String name);
	
	@Query(value = "{category:'?0'}", fields = "{'name' : 1, 'quantity' : 1}")
	GroceryItem findAll(String category);
	
	public long count();
	
	
}
