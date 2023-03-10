package com.meta.overwash.controller.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meta.overwash.domain.UserDTO;
import com.meta.overwash.service.UserService;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
public class CommonRestController {
	
	@Autowired
	private UserService userSerivce;
	
	@GetMapping("/user")
	public String getUser(@RequestParam("email") String email) {
				
		log.info("getUser : 이메일 중복 검사 호출..........");
		
		/* email(username) 중복 체크
	 	null이 아니면 이미 등록된 이메일이 있는 것 */

		return userSerivce.getUser(email) == null ? "possible" : "impossible";
		
	}
	
}
