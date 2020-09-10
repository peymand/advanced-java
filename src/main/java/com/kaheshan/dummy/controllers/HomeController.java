package com.kaheshan.dummy.controllers;

import com.kaheshan.dummy.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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
	public String showName(Person p, ModelMap modelMap){

		modelMap.addAttribute("person",p);

		return "show-name";
	}
}
