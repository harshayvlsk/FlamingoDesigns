package com.Harsha.Flamingo.DAO;

import java.util.List;

import com.Harsha.Flamingo.model.Category;

public interface CategoryDao {
	
	//CRUD Operations create save update delete 
	
	public boolean save(Category category);
	
	public boolean update(Category category);
	
	public boolean delete(Category category);
	
	public Category get(String id); //it is used to get all the fields in a category using primary key
	
	public List<Category> list();
	
}


