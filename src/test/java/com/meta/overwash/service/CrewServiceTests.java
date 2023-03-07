package com.meta.overwash.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.CrewDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
					"file:src/main/webapp/WEB-INF/spring/appServlet/security-context.xml"})
@Log4j
public class CrewServiceTests {
	
	@Autowired
	private CrewService crewService;
	
	
//	@Test
//	public void insertTest() throws Exception{
//		
//		CrewDTO crewDTO = new CrewDTO();
//		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
//		Date birth = date.parse("1996-04-09");
//		
//		
////		crewDTO.setCrewContact("010-1111-1111");
////		crewDTO.setPassword("1q2w3e4r");
////		crewDTO.setCrewName("홍길동");
////		crewDTO.setCrewBirth(birth);
////		crewDTO.setCarType("소나타");
////		crewDTO.setCarNumber("1234");
//		
//		crewDTO.setCrewContact("010-2222-2222");
//		crewDTO.setPassword("P@ssw0rd");
//		crewDTO.setCrewName("여성빈");
//		crewDTO.setCrewBirth(birth);
//		crewDTO.setCarType("아반떼");
//		crewDTO.setCarNumber("1111");
//		
//		crewService.insertCrew(crewDTO);
//		
//		log.info(",,,,,,,,,,,,,,,,,,,,,,,," + crewDTO);
//		
//	}
	
//	@Test
//	public void deleteTest() throws Exception{
//		log.info(",,,,,,,,,,,,,,,,,,,,,," + crewService.remove(7L));
//	}
	
//	@Test
//	public void getTest() throws Exception {
//		log.info(",,,,,,,,,,,,,,,," + crewService.get(6L));
//	}
	@Test
	public void modifytest() throws Exception {
		CrewDTO crewDTO = new CrewDTO();
		
		crewDTO.setCrewId(6L);
		crewDTO.setCrewContact("010-3333-4444");
		crewDTO.setPassword("aaaa1111");
		crewDTO.setCarType("소나타");
		crewDTO.setCarNumber("5555");
		
		log.info("............." + crewService.modify(crewDTO));
	}
	
	
}
