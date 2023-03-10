package com.meta.overwash.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.UserDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class UserMapperTests {

	@Autowired
	UserMapper mapper;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Test
	public void insertUserTest() {
		UserDTO user = new UserDTO();
		
//		user
//		user.setEmail("member");
		user.setPassword(bCryptPasswordEncoder.encode("1234"));
		user.setRole("ROLE_MEMBER");
		
//		user.setEmail("admin");
//		user.setPassword(bCryptPasswordEncoder.encode("1234"));
//		user.setRole("ROLE_ADMIN");
		
//		user.setEmail("crew");
//		user.setPassword(bCryptPasswordEncoder.encode("1234"));
//		user.setRole("ROLE_CREW");
		
//		user.setEmail("admin15523");
//		user.setPassword(bCryptPasswordEncoder.encode("1234"));
//		user.setRole("ROLE_ADMIN");
		
		mapper.insertUser(user);
		log.info(user);
	}

//	@Test
//	public void getUserTest() {
//		UserDTO user = new UserDTO();
//		user.setEmail("member");
//		log.info(mapper.getUser("member"));
//
//	}

}
