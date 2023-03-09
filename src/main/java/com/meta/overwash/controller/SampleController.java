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
	
	@GetMapping("member/main")
	public String list() {
		return "member/main";
	}
	
	@GetMapping("member/mypage")
	public String mypage() {
		return "member/mypage";
	}
	
	@GetMapping("member/request")
	public String request() {
		return "member/request";
	}
	
	@GetMapping("member/result")
	public String result() {
		return "member/result";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("crew/main")
	public String crewMain() {
		return "crew/main";
	}
	
	@GetMapping("crew/mypage")
	public String crewMypage() {
		return "crew/mypage";
	}
	
	@GetMapping("admin/main")
	public String adminMain() {
		return "admin/main";
	}
	
	@GetMapping("admin/mypage")
	public String adminMypage() {
		return "admin/mypage";
	}
}
