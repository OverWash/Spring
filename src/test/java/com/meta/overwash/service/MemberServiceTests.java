package com.meta.overwash.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.MemberDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/security-context.xml" })
@Log4j
public class MemberServiceTests {

	@Autowired
	MemberService service;

//	@Test
//	public void modifyMemberTest() {
//		MemberDTO member = new MemberDTO();
//		member.setNickname("수정된닉네임");
//		member.setMemberId(1);
//		if (service.modifyMember(member)) {
//			log.info(member);
//		};
//	}

//	@Test
//	public void insertMemberTest() {
//		MemberDTO member = new MemberDTO();
//		member.setEmail("sj@gmail.com");
//		member.setPassword("1234");
//		member.setMemberContact("01012345678");
//		member.setMemberAddress("서울시 서초구 양재동");
//
//		service.insertMember(member);
//		log.info(member);
//	}
	
//	@Test
//	public void loginMemberTest() {
//		MemberDTO member = new MemberDTO();
//		member.setEmail("sj@gmail.com");
//		member.setPassword("1234");
//		
//		log.info("LOGIN RESULT: " + service.loginMember(member));
//	}
}
