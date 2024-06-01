package com.training.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.training.dao.ProductsDao;
import com.training.dto.ProductsResponse;
import com.training.model.Products;
import com.training.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDao productsDao;

	@Override
	public List<ProductsResponse> getProducts() {
		List<Products> mappings = productsDao.findAll(Sort.by(Sort.Direction.ASC, "productId"));
		if (mappings.isEmpty()) {
			return null; // Or throw an exception if user not found
		}
		List<ProductsResponse> productList = mappings.stream().map(mapping -> {
			ProductsResponse detail = new ProductsResponse();
			detail.setProductId(mapping.getProductId());
			detail.setDescription(mapping.getDescription());
			detail.setProductTitle(mapping.getProductTitle());
			detail.setPrice(mapping.getPrice());
			detail.setCreatedBy(mapping.getCreatedBy().getUsername());
			detail.setUpdatedBy(mapping.getUpdatedBy().getUsername());
			return detail;
		}).collect(Collectors.toList());
		return productList;

	}

}
