package com.meta.overwash.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication auth) throws IOException, ServletException {
		
		log.info("로그인 성공... 해당 권한 페이지로 이동합니다.");
		
		// 권한을 리스트로 추출
		List<String> roleNames = new ArrayList<>();
		
		auth.getAuthorities().forEach(a -> {
			roleNames.add(a.getAuthority());
		});
		
//		log.info("ROLENAMES: " + roleNames);
		
		// 로그인 성공 시 수행할 작업
		if (roleNames.contains("ROLE_MEMBER")) {
			
			response.sendRedirect("/member/main");
			return;
		}
		
		if (roleNames.contains("ROLE_ADMIN")) {
			response.sendRedirect("/admin/main");
			return;
		}
		
		if (roleNames.contains("ROLE_CREW")) {
			response.sendRedirect("/crew/main");
			return;
		}

		// 가진 권한이 없으면 잘못된 접근이므로 로그인 페이지로 재이동
		response.sendRedirect("/login");

	}

}
