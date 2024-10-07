package com.exampleMongoDB.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleMongoDB.grocery.model.GroceryItem;
import com.exampleMongoDB.grocery.service.GroceryItemService;


@RestController
@RequestMapping("/grocery")
public class GroceryController {

	@Autowired
	public GroceryItemService service;

	@GetMapping("/all")
	public List<GroceryItem> takesAll() {
		return service.allItems();
	}

	@PostMapping("/inserir")
	public GroceryItem inserir(@RequestBody GroceryItem items) {
		return service.saveItems(items);		
	}
}
