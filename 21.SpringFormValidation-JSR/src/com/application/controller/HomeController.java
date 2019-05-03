package com.application.controller;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.model.Student;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String register() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView submitForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if(result.hasErrors()){
			ModelAndView registerModel = new ModelAndView("register");
			return registerModel;
		}
		
		ModelAndView model = new ModelAndView("welcomePage");
		model.addObject("helloMessage", "welcome to header message");
		model.addObject("student",new Student());
		return model;
	}

}
