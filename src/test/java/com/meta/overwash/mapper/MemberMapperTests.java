package com.meta.overwash.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class MemberMapperTests {
	
	@Autowired
	MemberMapper mapper;
	
//	@Test
//	public void getMemberContactTest() throws Exception {
//		String contact = "01020002004";
//		String result = mapper.getMemberContact(contact);
//		log.info("연락처 찾기 결과: " + result);
//	}
	
	@Test
	public void getMember() throws Exception {
		log.info("getMember ........." + mapper.getMember(4L));
	}
	
}
