package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class secondController {
	@RequestMapping("/new")
	public String newHandler(HttpSession session ,Model model ) {
		
		String firstName =(String)session.getAttribute("firstName");
		String newfirstName ="MR "+firstName;
		model.addAttribute("firstName",newfirstName);
		
		String lastName =(String)session.getAttribute("lastName");
		String newlastName ="MR "+lastName;
		model.addAttribute("lastName",newlastName);
		
	String address = (String)session.getAttribute("address");
	String newadd= " veldurthi "+address;
	model.addAttribute("address", newadd);
	
	session.invalidate();
	System.out.println("Calling new controller"+newadd);
		return "home-page";
		
	}

}
