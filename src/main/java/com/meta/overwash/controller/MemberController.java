package com.meta.overwash.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

//	@GetMapping({ "/mypage", "/modify" })
//	public void get(@RequestParam("memberId") Long memberId, Model model) throws Exception {
//		model.addAttribute("memberInfo", memberService.get(memberId));
//	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("memberId") Long memberId, RedirectAttributes rttr) throws Exception {
		if (memberService.remove(memberId)) {
			rttr.addFlashAttribute("result", "success"); // view에서 success시 탈퇴 완료 alert?
		}

		return "redirect:/login";
	}
	
	@PatchMapping("/modify")
	public String modify(UserDTO user, MemberDTO member, RedirectAttributes rttr) throws Exception {
		if (memberService.modify(user, member)) {
			rttr.addAttribute("result", "success");// view에서 success시 변경 완료 alert?
		} else {
			rttr.addAttribute("result", "fail"); // view에서 fail시 변경 실패 alert?
		}

		return "redirect:/member/main";
	}

	
	// ----------테스트용-----------
	@GetMapping("/request")
	public void request() {
		
	}
	
	@GetMapping("/result")
	public void result() {
		
	}
	
	
	
}
