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
import com.meta.overwash.service.LaundryService;
import com.meta.overwash.service.PaymentService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	LaundryService laundryService;

	// 검수 예정 내역
	// 세탁 예정 목록
	@GetMapping("/main")
	public void main(Criteria cri, Model model) {
		PagenationDTO paging = new PagenationDTO(cri, laundryService.getCount());
		model.addAttribute("laundryPaging", paging);

	}

	// 이동 시 검수 디테일페이지로 이동
	// 의류 가격에 대한 데이터를 띄워야하므로 laundryList를 보내줌
	@GetMapping("/check/{rcno}")
	public String check(@PathVariable("rcno") Long rcNo, Model model) {

		model.addAttribute("laundryList", laundryService.getList());

		return "/admin/check";
	}

	@PostMapping("/request")
	public void request(ArrayList<LaundryDTO> laundryList) {
		System.out.println(laundryList);
		for (LaundryDTO l : laundryList) {
			System.out.println(l);
		}
	}
}
