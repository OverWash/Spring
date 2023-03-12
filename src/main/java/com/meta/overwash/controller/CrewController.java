package com.meta.overwash.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.domain.UserDTO;
import com.meta.overwash.service.CrewService;

@Controller
@RequestMapping("/crew")
public class CrewController {

	@Autowired
	private CrewService crewService;

	@GetMapping("/main")
	public void crewMain(HttpSession session) throws Exception {
		// 메인페이지에서 보여줄 것들 추가
		UserDTO user = (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		CrewDTO crew = crewService.getCrew(user.getUserId());

		session.setAttribute("username", crew.getCrewName()); // navBar에 크루 네임 계속 보여 주기 위해
		session.setAttribute("member", crew);
	}

//	@GetMapping({ "/mypage", "/modify" })
//	public void get(@RequestParam("userId") Long userId, Model model) throws Exception {
//		model.addAttribute("crewInfo", crewService.getCrew(userId));
//	}

	@PostMapping("/remove")
	public String remove(@RequestParam("crewId") Long crewId, RedirectAttributes rttr) throws Exception {
		if (crewService.remove(crewId)) {
			rttr.addFlashAttribute("result", "success"); // view에서 success시 탈퇴 완료 alert?
		}

		return "redirect:/login"; // /crew/login 에서 /login 으로 변경함
	}

	@PatchMapping("/modify")
	public String modify(UserDTO user, CrewDTO crew, RedirectAttributes rttr) throws Exception {
		if (crewService.modify(user, crew)) {
			rttr.addAttribute("result", "success");// view에서 success시 변경 완료 alert?
		} else {
			rttr.addAttribute("result", "fail"); // view에서 fail시 변경 실패 alert?
		}

		return "redirect:/crew/main";
	}

}
