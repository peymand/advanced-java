package com.kaheshan.dummy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public String showPage() {
		return "main-menu";
	}


	@RequestMapping(value = "/get-name", method = RequestMethod.GET)
	public String getName(){
		return "get-name";
	}

	@PostMapping(value = "/show-name")
	public String showName(String name ){


		System.out.println(name);

		return "show-name";
	}
}
