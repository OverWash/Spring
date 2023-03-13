package com.meta.overwash.controller;

import java.security.Principal;
import java.text.ParseException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.ReservationDTO;
import com.meta.overwash.service.ReservationService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/reservation/*")
@Log4j
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/request")
	public String result(Principal principal, ReservationDTO reservation, HttpSession session) throws ParseException {
		MemberDTO member = (MemberDTO) session.getAttribute("member");
		reservation.setMember(member);
		reservationService.insert(reservation);

		return "redirect:/member/main";
	}
}
