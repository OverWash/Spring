package com.meta.overwash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crew")
public class CrewController {
	
	@GetMapping("/main")
	public void crewMain() {
		
	}
	
	@GetMapping("/register")
	public void crewRegister() {
		
	}
	
	
}
