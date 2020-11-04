package com.kaheshan.dummy.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@Autowired
	private SessionFactory sessionFactory;

	@RequestMapping(value = "/", method = {RequestMethod.GET,RequestMethod.POST})
	public String showPage(@RequestBody(required = false) String s)
	{
//		System.out.println(s);
		return "main-menu";
	}

	@RequestMapping(value = "/showMyLoginPage", method = {RequestMethod.GET,RequestMethod.POST})
	public String afterLogin(@RequestBody(required = false) String s)
	{
//		System.out.println(s);
		return "fancy-login";
	}
}
