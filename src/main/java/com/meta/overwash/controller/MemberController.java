package com.meta.overwash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/member/*")
@Log4j
public class MemberController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/main")
	public void main() {
		// 메인페이지에서 보여줄 것들 추가
		
	}
	
//	// REST로 변경하기
//	@PostMapping("/remove")
//	public String remove(Long memberId, RedirectAttributes rttr) {
//		if (service.removeMember(memberId)) {
//			rttr.addFlashAttribute("result", "success");
//		}
//		return "redirect:/member/login";
//	}
//	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("memberId") Long memberId, Model model) {
		model.addAttribute("member", service.getMember(memberId));
	}
	
	// REST로 변경하기
	@PostMapping("/modify")
	public String modify(MemberDTO member, RedirectAttributes rttr) {
		if (service.modifyMember(member)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/member/main";
	}

	
	@GetMapping("/mypage")
	public void mypage(MemberDTO member, Model model) {
		// 이용 내역 추가
		
	}
	
	
	
	
}
