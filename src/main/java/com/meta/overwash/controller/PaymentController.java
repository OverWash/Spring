package com.meta.overwash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.meta.overwash.service.PaymentService;

@Controller
public class PaymentController {
	@Autowired
	PaymentService receiptService;

	// 고객의 결제완료
	// rest로 변경?
//	@PostMapping("/process/detail")
//	public String process(ReceiptDTO receipt) {
//		receiptService.paymentProcess(receipt);
//		return "/member/main";
//	}
	
	// view
	@GetMapping("/payment/receipt")
	public void receipt() {

	}

}
