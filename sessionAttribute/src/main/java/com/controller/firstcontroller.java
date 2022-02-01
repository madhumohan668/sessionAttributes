package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"firstName","lastName"})
@Controller
public class firstcontroller {
	
	@RequestMapping("/first")
	public String firstHandler(Model model , HttpServletRequest request) {
		System.out.println("first Controlled called");
	model.addAttribute("firstName" , "madhumohan");
	model.addAttribute("lastName" , "boya");
	model.addAttribute("next", "/second");
		
	HttpSession session =request.getSession();
	session.setAttribute("address","banglore");
		return "home-page";
		
	}
	@RequestMapping("/second")
	public String secondHandler(Model model1, HttpSession session) {
		System.out.println("second COntroller called");
		String firstName =(String) model1.getAttribute("firstName");
		
		String address = (String)session.getAttribute("address");
		String newadd =" dhone "+ address;
		model1.addAttribute("address", newadd);
		model1.addAttribute("next", "/third");
		
		
		return "home-page";
		
	}
	@RequestMapping("/third")
	public String ThirdHandler(Model model2 , HttpSession session) {
		System.out.println("third Controller Called");
		
	String firstName = (String)model2.getAttribute("firstName");
	String address = (String)session.getAttribute("address");
	String newadd =" pp "+address;
	model2.addAttribute("address" ,newadd);
	model2.addAttribute("next","/new");
	return "home-page";
	}
}