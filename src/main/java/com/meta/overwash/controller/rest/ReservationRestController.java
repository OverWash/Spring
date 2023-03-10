package com.meta.overwash.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.meta.overwash.domain.ReservationDTO;
import com.meta.overwash.service.ReservationService;

@RestController
public class ReservationRestController {
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping(value = "/reservations/getdetail?={}", method=RequestMethod.GET)
	public String reservationDetailModalPopUP(ReservationDTO reservation, Model model) {
		model.addAttribute("reservation", reservationService.getListEachOne(reservation));
		
		return "/reservations/getdetailResult";
	}
	
}
