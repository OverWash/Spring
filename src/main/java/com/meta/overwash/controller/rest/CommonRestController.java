package com.meta.overwash.controller.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meta.overwash.service.CrewService;
import com.meta.overwash.service.MemberService;
import com.meta.overwash.service.UserService;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
public class CommonRestController {
	
	@Autowired
	private UserService userSerivce;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private CrewService crewService;
	
	@GetMapping("/check")
	public String getUserEmail(@RequestParam("email") String email) {
		log.info("getUserEmail : 이메일 중복 검사 호출..........");
		
		/* email(username) 중복 체크 :  null이 아니면 이미 등록된 이메일이 있는 것 */
		return userSerivce.getUser(email) == null ? "possible" : "impossible";
	}
	
	@GetMapping("/check/member/{contact}")
	public String getMemberContact(@PathVariable("contact") String contact) throws Exception {
		log.info("getMemberContact :  멤버 테이블 전화번호 중복 검사 호출...........");
		return memberService.getContact(contact) == null ? "possible" : "impossible";
	}
	
	@GetMapping("/check/crew/{contact}")
	public String getCrewContact(@PathVariable("contact") String contact) throws Exception {
		log.info("getCrewContact :  크루 테이블 전화번호 중복 검사 호출...........");
		return crewService.getContact(contact) == null ? "possible" : "impossible";
	}
	

	
}
