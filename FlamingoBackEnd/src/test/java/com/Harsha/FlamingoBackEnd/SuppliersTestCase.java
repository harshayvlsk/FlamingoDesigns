package com.Harsha.FlamingoBackEnd;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Harsha.Flamingo.DAO.SuppliersDao;
import com.Harsha.Flamingo.model.Suppliers;

public class SuppliersTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Suppliers suppliers;
	
	@Autowired
	static SuppliersDao suppliersDao;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.Harsha.Flamingo");
		context.refresh();
		
		 suppliersDao =(SuppliersDao) context.getBean("SuppliersDao");
		
		 suppliers =(Suppliers) context.getBean("Suppliers");
		
		System.out.println("the objectes are created");
	}
	
	//start writing Junit Test cases
	//For each method defined in DAO
	
	@Test//to make it as test case
	public void createSuppliersTestCase()
	{
		suppliers.setId("BOOK_07");
		suppliers.setAddress("This is book Suppliers");
		suppliers.setName("book Suppliers");
		
		Boolean status = suppliersDao.save(suppliers);
		
		Assert.assertEquals("Create Suppliers Test Case", true, status);
	}
	
	@Test 
	public void deleteSuppliersTestCae()
	{
		suppliers.setId("BOOK_07");
		Boolean status = suppliersDao.delete(suppliers);
		Assert.assertEquals("Delete Suppliers Test Case", true, status);
	}
	
	@Test
	public void updateSuppliersTestCase()
	{
		suppliers.setId("BOOK_07");
		suppliers.setAddress("This is book Suppliers");
		Boolean status = suppliersDao.update(suppliers);
		Assert.assertEquals("Update Suppliers Test Case", true, status);
	}
	@Test
	public void getSuppliersTestCase()
	{
		Assert.assertEquals("get Suppliers Test Case", null , suppliersDao.get("abcd"));
	}
	@Test
	public void getAllSuppliersTestCase()
	{
		Assert.assertEquals("get all Suppliers Test Case", 12 , suppliersDao.list().size());
	}

}
