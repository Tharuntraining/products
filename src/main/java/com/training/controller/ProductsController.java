package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.dto.ProductsResponse;
import com.training.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	private ProductsService productsService;

	@GetMapping("getproducts")
	public List<ProductsResponse> getProducts() {
		return productsService.getProducts();

	}

}
