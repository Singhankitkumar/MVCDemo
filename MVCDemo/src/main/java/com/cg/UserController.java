package com.cg;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Scope("session")
@Controller
@RequestMapping(value="user")




public class UserController {
	
	@RequestMapping(value="showLogin")
	public String prepareLogin(Model model){
		
		System.out.println("in prepareLogin() method");
		model.addAttribute("login",new Login());
		return "Login";
		
		
		
		
	}

	@RequestMapping(value="showRegister")
	public String prepareRegister(Model model){
		
		model.addAttribute("user",new User());
		return "register";
	}
	
}
