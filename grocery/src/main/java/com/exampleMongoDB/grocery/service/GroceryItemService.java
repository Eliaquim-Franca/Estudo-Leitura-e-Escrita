package com.exampleMongoDB.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleMongoDB.grocery.model.GroceryItem;
import com.exampleMongoDB.grocery.repository.ItemRepositoy;

@Service
public class GroceryItemService {
	
	@Autowired
	public ItemRepositoy repo;
	
	
	public List<GroceryItem> allItems(){
		List<GroceryItem> all = repo.findAll();
		return all;
	}


	public GroceryItem saveItems(GroceryItem items) {		
		return repo.save(items);		
	}
}
