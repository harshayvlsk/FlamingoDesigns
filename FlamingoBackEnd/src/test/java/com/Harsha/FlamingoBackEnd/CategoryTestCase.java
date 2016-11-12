package com.Harsha.FlamingoBackEnd;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Harsha.Flamingo.DAO.CategoryDao;
import com.Harsha.Flamingo.model.Category;

public class CategoryTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Category category;
	
	@Autowired
	static CategoryDao categoryDao;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.Harsha.Flamingo");
		context.refresh();
		
		 categoryDao =(CategoryDao) context.getBean("categoryDao");
		
		 category =(Category) context.getBean("category");
		
		System.out.println("the objectes are created");
	}
	
	//start writing Junit Test cases
	//For each method defined in DAO
	
	@Test//to make it as test case
	public void createCategoryTestCase()
	{
		category.setId("BOOK_07");
		category.setDescription("This is book category");
		category.setName("book category");
		
		Boolean status = categoryDao.save(category);
		
		Assert.assertEquals("Create Category Test Case", true, status);
	}
	
	@Test 
	public void deleteCategoryTestCae()
	{
		category.setId("BOOK_07");
		Boolean status = categoryDao.delete(category);
		Assert.assertEquals("Delete Category Test Case", true, status);
	}
	
	@Test
	public void updateCategoryTestCase()
	{
		category.setId("BOOK_07");
		category.setDescription("This is book category");
		Boolean status = categoryDao.update(category);
		Assert.assertEquals("Update Category Test Case", true, status);
	}
	@Test
	public void getCategoryTestCase()
	{
		Assert.assertEquals("get Category Test Case", null , categoryDao.get("abcd"));
	}
	@Test
	public void getAllCategoryTestCase()
	{
		Assert.assertEquals("get all Category Test Case", 12 , categoryDao.list().size());
	}

}
