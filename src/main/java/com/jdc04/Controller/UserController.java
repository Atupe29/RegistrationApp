package com.jdc04.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdc04.Entity.User;
import com.jdc04.service.UserService;

import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	
	@GetMapping("/")
	public String register(org.springframework.ui.Model model) {
User user=new User();

		model.addAttribute("user",user);
		return " register";
	}
	
	@PostMapping("registerUser")
	public String registerUser(@ModelAttribute("user") User user)
	{
		System.out.println(user);
		service.registerUser(user);
		return "home";
	}
}
