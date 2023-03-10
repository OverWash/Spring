package com.meta.overwash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meta.overwash.domain.PaymentRequestDTO;
import com.meta.overwash.domain.ReceiptDTO;
import com.meta.overwash.service.PaymentService;

@Controller
@RequestMapping("/payment")
public class PaymentRequestController {

	@Autowired
	PaymentService paymentService;

	//고객 결제요청 상세페이지
	@GetMapping("/process/{pno}")
	public void process(@PathVariable("pno") Long pno, Model model) {
		model.addAttribute("payment", paymentService.get(pno));
	}
	
	//관리자 결제요청서 발급
	@PostMapping("/process/detail")
	public void process(ReceiptDTO receipt) {
		paymentService.paymentProcess(receipt);
	}
	
	
}
