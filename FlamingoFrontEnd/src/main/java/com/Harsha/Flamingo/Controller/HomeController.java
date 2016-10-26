package com.Harsha.Flamingo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
	@RequestMapping("/")
	public String gotohome()
	{
		return "index";
	}
	@RequestMapping("/validate")
	public String validate(@RequestParam(name="userID") String id, @RequestParam("password")String pwd,Model model)
	{
		if(id.equals("niit") && pwd.equals("niit"))
			{
				model.addAttribute("Success","Logged in");
				return "index";
			}
		else
			{
			model.addAttribute("Error","Please Check");
			return "index";
			}
	}
	@RequestMapping("/Login")
	public String login(Model model)
	{
		model.addAttribute("userClickedLogin","true");
		return "login";
	}
//	@RequestMapping("/Login")
//	public ModelAndView login(Model model)
//	{
//		ModelAndView mv=new ModelAndView("index");
//		mv.addObject("userClickedLogin","true");
//		return mv;
//	}
//
	@RequestMapping("/Register")
	public String register(Model model)
	{
		model.addAttribute("userClickedRegister","true");
		return "register";
	}
}
