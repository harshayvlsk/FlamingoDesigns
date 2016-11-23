package com.Harsha.Flamingo.Controller;

import org.apache.taglibs.standard.tag.common.core.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Harsha.Flamingo.DAO.CategoryDao;
import com.Harsha.Flamingo.model.Category;

@Controller
public class CategoryController {
	
	@Autowired(required=true)
	private CategoryDao categoryDAO;
	
	@Autowired(required=true)
	private Category category;
	
	
	@RequestMapping(value="/categories")
	public String listcategory(Model model)
	{
	model.addAttribute("category",category);
	model.addAttribute("categoryList",this.categoryDAO.list());
	return "categories";
	}
	
	
	@RequestMapping(value="/addcategory")
	public String addcategory(@ModelAttribute("category") Category category,Model model)
	{
		//String newid = Util.remove(category.getId());
	//	category.setId(newid);
	
		categoryDAO.save(category);
	model.addAttribute("category", category);
	model.addAttribute("categoryList", this.categoryDAO.list());
	return "redirect:/categories";
    }

	
	
	@RequestMapping("/removecategory/{id}")
	public boolean deleteCategory(@PathVariable("id") String id, ModelMap model)
	
	{
		System.out.println("delete");
		categoryDAO.delete(id);
		return "redirect:/categories";
	}
	
	
	@RequestMapping("/editcategory/{id}")
	public String editCategory(@PathVariable("id")String id, Model model)
	{
		model.addAttribute("category",this.categoryDAO.get(id));
		/*model.addAttribute("category", category);*/
		model.addAttribute("categoryList", this.categoryDAO.list());
		
		return "categories";
	}
		
}
