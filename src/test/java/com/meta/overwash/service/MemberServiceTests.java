package com.meta.overwash.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.UserDTO;
import com.meta.overwash.mapper.UserMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class MemberServiceTests {

	@Autowired
	MemberService service;
	
	@Autowired
	UserMapper um;

	@Autowired
	BCryptPasswordEncoder be;
	@Test
	public void insertMemberTest() throws Exception{
		UserDTO user = new UserDTO();
		user.setEmail("admin");
		user.setPassword(be.encode("overwash"));
		user.setRole("ROLE_ADMIN");
		um.insertUser(user);
//		MemberDTO member = new MemberDTO();
//		member.setMemberContact("01012345678");
//		member.setMemberAddress("서울시 서초구 양재동");
//		member.setNickname("새회원");
//		
//		service.insert(user, member);
		
//		log.info(",," + user + ",," + member);
		
	}

//	@Test
//	public void loginMemberTest() {
//		MemberDTO member = new MemberDTO();
//		member.setEmail("sj@gmail.com");
//		member.setPassword("1234");
//		
//		log.info("LOGIN RESULT: " + service.loginMember(member));
//	}
}
