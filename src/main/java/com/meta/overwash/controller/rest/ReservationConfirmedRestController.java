package com.meta.overwash.controller.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.PagenationDTO;
import com.meta.overwash.service.PaymentService;
import com.meta.overwash.service.ReservationConfirmedService;

@RestController
public class ReservationConfirmedRestController {

	@Autowired
	ReservationConfirmedService rcService;

	public Map<String, Object> reservationConfirmedList(Criteria cri) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("reservationConfirmedPaging", new PagenationDTO(cri, rcService.getCount().intValue()));
		map.put("reservationConfirmeds", rcService.getList(cri));
		return map;
	}

}
