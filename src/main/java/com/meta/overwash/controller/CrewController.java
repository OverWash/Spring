package com.meta.overwash.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.service.CrewService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/crew")
public class CrewController {
	
	@Autowired
	private CrewService crewService;
	
	@GetMapping("/main")
	public void crewMain() throws Exception {
		
	}
	
	@GetMapping("/register")
	public void crewRegister() throws Exception {
		
	}
	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("crewId") Long crewId, Model model) throws Exception {
		model.addAttribute("crew", crewService.get(crewId));
	}
	
	@PostMapping("/register")
	public String register(CrewDTO crewDTO, RedirectAttributes rttr) throws Exception {
		
		crewService.insertCrew(crewDTO);
		rttr.addFlashAttribute("result", "success"); // view에서 success시 회원 가입 완료 alert?
		
		return "redirect:/crew/login";
	}
	
	@PostMapping("/remove")
	public String remove (@RequestParam("crewId") Long crewId, RedirectAttributes rttr) throws Exception {
		if (crewService.remove(crewId)) {
			rttr.addFlashAttribute("result", "success"); // view에서 success시 탈퇴 완료 alert?
		}
		
		return "redirect:/crew/login";
	}
	
	
	@PostMapping("/modify")
	public String modify(CrewDTO crewDTO, RedirectAttributes rttr) throws Exception {
		if (crewService.modify(crewDTO)) {
			rttr.addAttribute("result", "success");// view에서 success시 변경 완료 alert?
		}
		
		return "redirect:/crew/main";
	}
	
}


















