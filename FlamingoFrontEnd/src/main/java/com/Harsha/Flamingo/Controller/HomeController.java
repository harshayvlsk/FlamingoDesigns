package com.Harsha.Flamingo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("carousel","true");
		return "index";
	}
	
	@RequestMapping("/validate")
	public String validate(@RequestParam("userid") String id, @RequestParam("pass") String pass1, Model model) {
		if (id.equals("Harsha") && pass1.equals("Harshayvlsk")) {
			model.addAttribute("successlogin", "successfully logged in");
			return "index";
		} else {
			model.addAttribute("failedlogin", "Failed to log in");
			return "login";
		}
	}

	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("log", "true");
		return "index";
	}

	@RequestMapping("/registerHere")
	public String registerHere(Model model) {
		model.addAttribute("reg", "true");
		return "index";
	}
	
	@RequestMapping("/register")
	public String register(Model m){
		m.addAttribute("reg1", "Successfully registered");
		return "login";
	}
	@RequestMapping("/suppliers")
	public String suppliers()
	{
		return "suppliers";
	}
	@RequestMapping("/category")
	public String category()
	{
		return "category";
	}
	@RequestMapping("/springform")
	public String springform()
	{
		return "springform";
	}
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("carousel","true");
		return "index";
	}
}
