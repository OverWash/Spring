package com.meta.overwash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.domain.ReservationConfirmedDTO;
import com.meta.overwash.service.PaymentService;

@Controller
public class PaymentRequestController {

	@Autowired
	PaymentService paymentService;

	// 고객의 상세페이지
	@GetMapping("/member/process/{pno}")
	public String process(@PathVariable("pno") Long pno, Model model) {
		model.addAttribute("payment", paymentService.get(pno));
		
		return "redirect:/member/main";
	}

	// 결제 요청
	// 수정중 (03.12) 세탁물 안받아와짐
	@PostMapping("/admin/payment/request")
	public String adminPaymentRequest(ArrayList<LaundryDTO> laundryList, ReservationConfirmedDTO rcDto, Model model) {
		if (paymentService.requestToAdmin(rcDto.getConfirmId(), laundryList) != null) {
			model.addAttribute("msg", "결제요청이 완료되었습니다.");

		} else {
			model.addAttribute("msg", "결제 요청이 취소되었습니다.");
		}
		return "/admin/main";
	}
}
