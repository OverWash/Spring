package com.meta.overwash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meta.overwash.service.LaundryService;
import com.meta.overwash.service.PaymentService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	LaundryService laundryService;

	// 검수 예정 내역
	// 세탁 예정 목록
	// 초기 화면일 뿐임
	@GetMapping("/main")
	public void adminMain() {
	}

	// 이동 시 검수 디테일페이지로 이동
	// 의류 가격에 대한 데이터를 띄워야하므로 laundryList를 보내줌
	@GetMapping("/check/{rcno}")
	public String adminCheckDetail(@PathVariable("rcno") Long rcNo, Model model) {
		model.addAttribute("laundryList", laundryService.getList());
		return "/admin/check";
	}

}
