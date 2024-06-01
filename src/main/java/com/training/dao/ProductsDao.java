package com.training.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.Products;

@Repository
public interface ProductsDao extends JpaRepository<Products, Integer> {
	@Override
	public List<Products> findAll();

}
