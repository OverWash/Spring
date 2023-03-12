package com.meta.overwash.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meta.overwash.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/member/*")
@Log4j
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/main")
	public void main() {
		// 메인페이지에서 보여줄 것들 추가
		
	}

//	@GetMapping({ "/mypage" })
//	public void get() throws Exception {
////		model.addAttribute("memberInfo", memberService.get(memberId));
//		//@RequestParam("memberId") Long memberId
//	}
	
	@PostMapping("/mypage")
	public String myPage(HttpServletRequest request, Model model) throws Exception{
		Long userId = Long.parseLong(request.getParameter("userId"));
		model.addAttribute("memberDTO", memberService.get(userId));
		
		return "member/mypage";
	}
	
	
	@PostMapping("/modifyInfo")
	public String modifyInfo(HttpServletRequest request, Model model) throws Exception{
		Long userId = Long.parseLong(request.getParameter("userId"));
		model.addAttribute("memberDTO", memberService.get(userId));
		return "member/modifyInfo";
	}
	
//	@PostMapping("/remove")
//	public String remove(@RequestParam("memberId") Long memberId, RedirectAttributes rttr) throws Exception {
//		if (memberService.remove(memberId)) {
//			rttr.addFlashAttribute("result", "success"); // view에서 success시 탈퇴 완료 alert?
//		}
//
//		return "redirect:/login";
//	}
	
//	@PatchMapping("/modify")
//	public String modify(UserDTO user, MemberDTO member, RedirectAttributes rttr) throws Exception {
//		if (memberService.modify(user, member)) {
//			rttr.addAttribute("result", "success");// view에서 success시 변경 완료 alert?
//		} else {
//			rttr.addAttribute("result", "fail"); // view에서 fail시 변경 실패 alert?
//		}
//
//		return "redirect:/member/main";
//	}

	
	
	
}
