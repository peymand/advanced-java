package com.kaheshan.dummy.controller;

import com.kaheshan.dummy.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {


	@RequestMapping("/show-form")
	public String showForm(Model theModel) {

		// create a student object
		Student theStudent = new Student();
		theStudent.setFirstName("ali");
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping(value = "/processForm")
	public String processForm(@ModelAttribute("s1") Student theStudent) {

		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());

		return "student-confirmation";
	}
	
}









