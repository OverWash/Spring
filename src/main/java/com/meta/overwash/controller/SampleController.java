package com.meta.overwash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	// 페이지 이동용 임시 컨트롤러입니다.
	@GetMapping("/login")
	public String sign() {
		return "login";
	}
	
	@GetMapping("/list")
	public String list() {
		return "list";
	}
	
	@GetMapping("/mypage")
	public String mypage() {
		return "mypage";
	}
	
	@GetMapping("/request")
	public String request() {
		return "request";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
