package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String firstpage()
	{
		return "login";
	}
	
	@RequestMapping("/log")
	public String logincheck(@RequestParam ("uname")String uname,@RequestParam("pass")String pass, ModelMap m)
	{
		m.addAttribute("us",uname);
		m.addAttribute("ps",pass);

		return "success";
	}

}
