package com.meta.overwash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.UserDTO;
import com.meta.overwash.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/member/*")
@Log4j
public class MemberController {

	@Autowired
	private MemberService memberService;

	@GetMapping("/main")
	public void main(HttpSession session) throws Exception {
		// 메인페이지에서 보여줄 것들 추가
		UserDTO user = (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		MemberDTO member = memberService.getMember(user.getUserId());
		
		session.setAttribute("username", member.getNickname()); // navBar에 닉네임 계속 보여 주기 위해
		session.setAttribute("member", member);
	}

	@PostMapping("/mypage")
	public String myPage(HttpServletRequest request, Model model) throws Exception{
		Long userId = Long.parseLong(request.getParameter("userId"));
		model.addAttribute("memberDTO", memberService.getMember(userId));
		
		return "member/mypage";
	}
	
	@PostMapping("/modifyInfo")
	public String modifyInfo(HttpServletRequest request, Model model) throws Exception{
		Long userId = Long.parseLong(request.getParameter("userId"));
		model.addAttribute("memberDTO", memberService.getMember(userId));
		return "member/modifyInfo";
	}
	
}
