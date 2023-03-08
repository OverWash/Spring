package com.meta.overwash.mapper;

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
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/security-context.xml"})
@Log4j
public class CrewMapperTests {
	
	@Autowired
	private CrewMapper crewMapper;
	
//	@Test
//	public void insertTest() throws Exception{
//		
//		CrewDTO crewDTO = new CrewDTO();
//		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
//		Date birth = date.parse("1996-04-09");
//		
//		
//		crewDTO.setCrewContact("010-1111-1111");
//		crewDTO.setPassword("1q2w3e4r");
//		crewDTO.setCrewName("홍길동");
//		crewDTO.setCrewBirth(birth);
//		crewDTO.setCarType("소나타");
//		crewDTO.setCarNumber("1234");
//		
//		crewMapper.insertCrew(crewDTO);
//		
//		log.info(",,,,,,,,,,,,,,,,,,,,,,,," + crewDTO);
//		
//	}
}








