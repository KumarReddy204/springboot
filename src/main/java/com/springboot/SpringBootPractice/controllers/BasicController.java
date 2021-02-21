
package com.springboot.SpringBootPractice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController
{

	@RequestMapping("/welcome")
	public String welcomeMethod()
	{
		System.out.println("Welcome Method");
		return "Welcome to SpringBoot Kumar!!";
	}
}
