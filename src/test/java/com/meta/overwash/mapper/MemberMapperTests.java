package com.meta.overwash.mapper;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.UserDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class MemberMapperTests {
	
	@Autowired
	MemberMapper mapper;
	@Test
	public void insertUserTest() throws Exception {
		UserDTO user = new UserDTO();
		user.setUserId(2L);
		user.setEmail("member2@gamil.com");
		MemberDTO member = new MemberDTO();
		member.setMemberAddress("영등포구 여의도");
		member.setMemberContact("01087654321");
		member.setNickname("OldMember");
		member.setUser(user);
		
		mapper.insertMember(member);
		log.info(user);
	}
}
