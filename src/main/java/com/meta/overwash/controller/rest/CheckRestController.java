package com.meta.overwash.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.meta.overwash.domain.CheckDTO;
import com.meta.overwash.service.CheckService;

@RestController
public class CheckRestController {

	@Autowired
	CheckService checkService;
	
	@GetMapping("/check/{confirmId}")
	public ResponseEntity<List<CheckDTO>> getCheckList(@PathVariable("confirmId") Long confirmId) {
		
		return new ResponseEntity<List<CheckDTO>>(checkService.getCheckList(confirmId),HttpStatus.OK);
	}
}
