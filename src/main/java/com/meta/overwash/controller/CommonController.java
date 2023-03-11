package com.meta.overwash.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.meta.overwash.domain.UserDTO;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {

	// 추후에 처음 서버 켰을 때 루트 페이지를 여기로 변경해야 함
	@GetMapping("/login")
	public void login(String error, String logout, Model model) {
		// 로그인 실패 시 view로 에러 메시지 넘겨 줌
		if (error != null) {
			model.addAttribute("error", "로그인에 실패하였습니다.");
		}

		// 로그아웃했을 경우
		if (logout != null) {
			model.addAttribute("logout", "로그아웃 완료.");
		}
	}
	@GetMapping("/signup")
	public void signup() {
		
	}
	@GetMapping("/logout")
	public void logout() {

	}

	// 접근 권한 에러 커스텀 처리
	@GetMapping("/accessError")
	public void accessError(Authentication auth, Model model) {
		log.warn("access denided: " + auth);
		model.addAttribute("msg", "해당 권한이 없습니다.");
	}

	@GetMapping("/register")
	public void register() {

	}

	@PostMapping("/register")
	public String register(String role) {
		
		return role.equals("ROLE_MEMBER") ? "redirect:/register/member" : "redirect:/register/crew";
	}
	
	@GetMapping({"/register/member", "/register/crew"})
	public void registerUser() {
		
	}
	
	@PostMapping("/register/member")
	public String registerMember() {
		
		return "redirect:/login";
	}
	
	
//	@PostMapping("/register")
//	public String register(UserDTO user) {
//		// 가입 시 입력한 유형이 멤버이면
//		if (user.getRole().equals("ROLE_MEMBER")) {
//			
//		} else if (user.getRole().equals("ROLE_CREW")) {
//			
//		}
//			
//		
//		return "redirect:/login";
//	}

	// ------- test------

	// 권한 확인용 임시 url 나중에 삭제하기
//	@GetMapping("/admin/main")
//	public void mainAdmin() {
//
//	}
//
//	@GetMapping("/crew/main")
//	public void mainCrew() {
//
//	}

	// -------------------
}
