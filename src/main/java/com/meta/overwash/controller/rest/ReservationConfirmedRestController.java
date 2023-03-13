package com.meta.overwash.controller.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.PagenationDTO;
import com.meta.overwash.service.ReservationConfirmedService;

@RestController
public class ReservationConfirmedRestController {

	@Autowired
	ReservationConfirmedService rcService;

	// 관리자 예약 확정 리스트에 대한 컨트롤러 
	public ResponseEntity<Map<String, Object>> reservationConfirmedList(Criteria cri) {
		rcService.getList(cri);
		
		return new ResponseEntity<Map<String, Object>>(rcService.getList(cri), HttpStatus.OK);
	}

}
