package com.kaheshan.dummy.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private SessionFactory sessionFactory;

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
