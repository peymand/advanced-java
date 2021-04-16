package com.kaheshan.dummy.controller;

import com.kaheshan.dummy.model.Student;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel, Student theStudent) {
		
		// create a student object
//		Student theStudent = new Student();
		// add student object to the model
//		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}

	//http://localhost:8080/student/get?id=1
	//http://localhost:8080/student/get/id/1

	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("student") @Valid Student theStudent, BindingResult result, @RequestBody String body) {

		if(result.hasErrors()){
			return "student-form";
		}

		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
		
		return "student-confirmation";
	}

	@ModelAttribute
	public void addStudentToModel(Model model){
		model.addAttribute("student",new Student());
	}
	
}









