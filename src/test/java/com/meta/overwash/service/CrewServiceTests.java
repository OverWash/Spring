package com.meta.overwash.service;

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
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
					"file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@Log4j
public class CrewServiceTests {
	
	@Autowired
	private CrewService crewService;
	
//	@Test
//	public void insertTest() throws Exception{
//		
//		CrewDTO crew = new CrewDTO();
//		UserDTO user = new UserDTO();
//		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
//		Date birth = date.parse("1996-04-10");
//		
//		user.setEmail("crew99@gmail.com");
//		user.setPassword("1111");
//		
//		
////		crew.setCrewContact("010-1111-1111");
////		crew.setCrewName("홍길동");
////		crew.setCrewBirth(birth);
////		crew.setCarType("소나타");
////		crew.setCarNumber("1234");
//		
//		crew.setCrewContact("010-1111-9999");
//		crew.setCrewName("백성준");
//		crew.setCrewBirth(birth);
//		crew.setCarType("레이");
//		crew.setCarNumber("0900");
//		
//		crewService.insert(user, crew);
//		
//		log.info(",," + user + ",," + crew);
//		
//	}
//	@Test
//	public void deleteTest() throws Exception{
//		log.info(",,,,,,,,,,,,,,,,,,,,,," + crewService.remove(2L));
//	}
//	@Test
//	public void getTest() throws Exception {
//		log.info(",,,,,,,,,,,,,,,," + crewService.get(3L));
//	}
//	@Test
//	public void modifytest() throws Exception {
//		CrewDTO crewDTO = new CrewDTO();
//		
//		crewDTO.setCrewId(3L);
//		crewDTO.setCrewContact("010-3333-4444");
//		crewDTO.setPassword("aaaa1111");
//		crewDTO.setCarType("벤츠");
//		crewDTO.setCarNumber("7777");
//		
//		log.info("............." + crewService.modify(crewDTO));
//	}
//	@Test
//	public void getTest() throws Exception{
//		
//		CrewDTO crew = crewService.get(1L);
//		
//		System.out.println(crew);
//	}
//	@Test
	public void modifyTest() throws Exception {		
		UserDTO user = new UserDTO();
		user.setUserId(2L);
		user.setEmail("crew05@gmail.com");
		
//		CrewDTO crew = new CrewDTO();
//		
//		crew.setCrewId(2L);
//		crew.setCrewContact("010-1111-1111");
//		crew.setCarType("벤츠 s클래스");
//		crew.setCarNumber("4444");
		
//		 //db에 있는 데이터를 가져와야함
//		CrewDTO db = crewService.get(2L);
//		db.getUser().setPassword("2222");
//		
//		db.setCarType("마이바흐");
//		db.setCrewId(2L);
//		UserDTO user = db.getUser();
		
			
//		log.info("././././././././././././../././. modify : " + crewService.modify(user, db));
		
	}
//	@Test
//	public void getListTest() throws Exception{
//		
//		List<Map<String, Object>> crewInfoList = crewService.getCrewList("ROLE_CREW");
//		
//		System.out.println(crewInfoList);
//	}	
//	@Test
//	public void deleteTest() throws Exception{
//		
//		CrewDTO crew = crewService.get(2L);
//		
//		crewService.remove(crew.getCrewId());
//		
//		
//		
//	}
	
	
}

























