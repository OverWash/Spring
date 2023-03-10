package com.meta.overwash.controller.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.PagenationDTO;
import com.meta.overwash.service.PaymentService;

@RestController
public class PaymentRequestRestController {

	@Autowired
	PaymentService paymentService;
	
	@GetMapping("/admin/")
	public Map<String, Object> paymentList(Criteria cri) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("paymentPaging", new PagenationDTO(cri, paymentService.getCountToAdmin()  .intValue()));
		map.put("paymentRequests", paymentService.getListToAdmin(cri));
		return map;
	}

}
