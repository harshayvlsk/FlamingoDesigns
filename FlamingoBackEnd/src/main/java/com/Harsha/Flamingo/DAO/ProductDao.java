package com.Harsha.Flamingo.DAO;

import java.util.List;

import com.Harsha.Flamingo.model.Product;

public interface ProductDao {

public boolean save(Product product);
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
	public Product get(String id); 
	
	public List<Product> list();

}
