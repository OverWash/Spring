package com.meta.overwash.controller.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.meta.overwash.service.CheckService;

@RestController
public class CheckRestController {

	@Autowired
	CheckService checkService;
	
	@GetMapping("/check/{confirmId}")
	public ResponseEntity<Map<String, Object>> getCheckList(@PathVariable("confirmId") Long confirmId) {
		
		return new ResponseEntity<Map<String, Object>>(checkService.getCheckList(confirmId),HttpStatus.OK);
	}
}
