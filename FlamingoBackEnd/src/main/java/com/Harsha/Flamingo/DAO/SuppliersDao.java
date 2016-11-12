
package com.Harsha.Flamingo.DAO;

import java.util.List;

import com.Harsha.Flamingo.model.Suppliers;

public interface SuppliersDao {

	public boolean save(Suppliers supplier);
	
	public boolean update(Suppliers supplier);
	
	public boolean delete(Suppliers supplier);
	
	public Suppliers get(String id); 
	
	public List<Suppliers> list();
	
}