package com.springboot.learn.CourseAPI.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePage {
	//by default httpmethod is get
	
	@RequestMapping("/welcome")
	public String WelcomeMessage() 
	{
		return "Hi There! Lets start learning";
	}
}
