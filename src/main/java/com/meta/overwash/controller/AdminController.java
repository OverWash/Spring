package com.meta.overwash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.domain.PagenationDTO;
import com.meta.overwash.domain.ReservationConfirmedDTO;
import com.meta.overwash.service.AdminService;
import com.meta.overwash.service.LaundryService;
import com.meta.overwash.service.PaymentService;
import com.meta.overwash.service.ReservationConfirmedService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	LaundryService laundryService;

	@Autowired
	PaymentService paymentService;

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

	// 결제 요청
	@PostMapping("/request")
	public String adminPaymentRequest(ArrayList<LaundryDTO> laundryList, ReservationConfirmedDTO rcDto, Model model) {
			model.addAttribute("msg", "결제요청이 완료되었습니다.");
			if (paymentService.requestToAdmin(rcDto.getConfirmId(), laundryList) != null) {

		} else {
			model.addAttribute("msg", "결제 요청이 취소되었습니다.");
		}
		return "/admin/main";
	}

}
