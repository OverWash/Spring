package com.meta.overwash.mapper;

import java.util.stream.IntStream;

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
public class MemberMapperTests {
	
	@Autowired
	MemberMapper mapper;
	
//	@Test
//	public void insertTest() {
//		MemberDTO member = new MemberDTO();
//		member.setEmail("sj@gmail.com");
//		member.setPassword("1234");
//		member.setMemberContact("01012345678");
//		member.setMemberAddress("서울시 서초구 양재동");
//		
//		mapper.insertMember(member);
//
////		IntStream.range(1, 10).forEach(i -> {
////			MemberDTO member = new MemberDTO();
////			member.setEmail("test" + i + "@gmail.com");
////			member.setPassword("test" + i);
////			member.setMemberContact(i + "");
////			member.setMemberAddress("서울시 서초구 양재동");
////			
////			mapper.insertMember(member);
////		});
//
//		log.info(member);
//	}
	
//	@Test
//	public void getListTest() {
//		log.info(mapper.getList());
//	}
	
//	@Test
//	public void getMemberTest() {
//		MemberDTO member = mapper.getMember(2L);
//		log.info(member);
//	}
	
//	@Test
//	public void updateMemberTest() {
//		MemberDTO member = new MemberDTO();
//		member.setMemberId(1);
//		member.setNickname("새로운닉네임");
//		
//		int count = mapper.updateMember(member);
//		log.info("UPDATE COUNT : " + count);
//	}
	
//	@Test
//	public void deleteMemberTest() {
//		int count = mapper.deleteMember(2L);
//		log.info("DELETE COUNT : " + count);
//	}
	
//	@Test
//	public void loginMemberTest() {
//		MemberDTO input = new MemberDTO();
//		input.setEmail("sj@gmail.com");
//		input.setPassword("1234");
//		
////		log.info("INPUT MEMBER ID: " + input);
//		MemberDTO member = mapper.loginMember(input);
//		log.info("SQL RESULT: " + member);
////		log.info("LOGIN RESULT: " + service.loginMember(member));
//	}
}
