package com.kaheshan.dummy.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private SessionFactory sessionFactory;

	@RequestMapping("/")
	public String showPage(@RequestBody(required = false) String s)
	{
		System.out.println(s);
		return "main-menu";
	}
}
