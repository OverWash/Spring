package com.meta.overwash.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.UserDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class UserMapperTests {

	@Autowired
	UserMapper userMapper;
	
	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	CrewMapper crewMapper;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;


//	@Test
//	public void getUserTest() {
//		UserDTO user = mapper.getUser("sojong1003@gmail.com");
//		log.info("TEST!!!!!!!!!" + user);
//
//	}
	
//	@Test
//	public void insertUserTest() throws Exception {
//		
//		IntStream.range(1, 8).forEach(i -> {
//			// user 생성
//			UserDTO user = new UserDTO();
//			user.setPassword(bCryptPasswordEncoder.encode("1234"));
//			
//			if (i < 4) {
//				// crew 생성
//				user.setEmail("crew" + i + "@gmail.com");			
//				user.setRole("ROLE_CREW");
//				userMapper.insertUser(user);
//				
//				CrewDTO crew = new CrewDTO();
//				
//				SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
//				Date birth = null;
//				try {
//					birth = date.parse("1996-04-09");
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				crew.setCrewContact("0101000100" + i);
//				crew.setCrewName("테스트크루" + i);
//				crew.setCrewBirth(birth);
//				crew.setCarType("소나타" + i);
//				crew.setCarNumber("11가100" + i);
//				
//				crew.setUser(user);
//				
//				try {
//					
//					crewMapper.insertCrew(crew);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				log.info(",,,,,,,,,,,,,,,,,,,,,,,," + crew);
//				
//			} else  if (i < 7) {
//				// member 생성
//				user.setEmail("member" + i + "@gmail.com");			
//				user.setRole("ROLE_MEMBER");
//				userMapper.insertUser(user);
//				
//				MemberDTO member = new MemberDTO();
//				
//				member.setNickname("테스트멤버" + i);
//				member.setMemberAddress("서울시 은평구 갈현" + i + "동");
//				member.setMemberContact("0102000200" + i);
//				
//				member.setUser(user);
//				
//				try {
//					memberMapper.insertMember(member);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				log.info(",,,,,,,,,,,,,,,,,,,,,,,," + member);
//				
//			} else {
//				// admin 생성
//				user.setEmail("admin");
//				user.setPassword(bCryptPasswordEncoder.encode("overwash"));
//				user.setRole("ROLE_ADMIN");
//				userMapper.insertUser(user);
//			}
//		});
//	
//	}
	
}
