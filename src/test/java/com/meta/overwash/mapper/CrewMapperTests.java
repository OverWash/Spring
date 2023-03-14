package com.meta.overwash.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.domain.UserDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@Log4j
public class CrewMapperTests {
	
	@Autowired
	private CrewMapper crewMapper;
	
	@Test
	public void insertTest() throws Exception{
        UserDTO user = new UserDTO();
        user.setUserId(4L);
		CrewDTO crew = new CrewDTO();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = date.parse("1996-04-09");
		
		crew.setUser(user);
        crew.setCrewContact("0101000100");
        crew.setCrewName("테스트크루");
        crew.setCrewBirth(birth);
        crew.setCarType("소나타");
        crew.setCarNumber("11가100");
		
		crewMapper.insertCrew(crew);
		
		log.info(",,,,,,,,,,,,,,,,,,,,,,,," + crew);
		
	}
}








