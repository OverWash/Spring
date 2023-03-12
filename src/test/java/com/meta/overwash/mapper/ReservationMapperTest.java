package com.meta.overwash.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.ReservationDTO;
import com.meta.overwash.domain.UserDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class ReservationMapperTest {

	@Autowired
	MemberMapper memberMapper;
	@Autowired
	ReservationMapper mapper;
	@Autowired
	BCryptPasswordEncoder bc;

//	@Test
//	public void getListEachOneTest() throws Exception {
//		ReservationDTO reservation = new ReservationDTO();
//		MemberDTO member = new MemberDTO();
//		UserDTO user = new UserDTO();
//		user.setEmail("member2@gmail.com");
//		reservation.setReservationId(6L);
//		member.setUser(user);
//		reservation.setMember(member);
//		mapper.getListEachOne(reservation);
//	}
//	OK
	
	@Test
	public void getUserIdTest() {
		String username = "member2@gmail.com";
		mapper.getMemberId(username);
	}

	@Test
	public void insertTest() {
		for(int i = 7; i< 102; i++) {
			try {
				MemberDTO member = memberMapper.getMember(1L);
				Date day = new Date();

				ReservationDTO reservation = new ReservationDTO();
				reservation.setMember(member);
				reservation.setCollectDate(day);
				reservation.setRequest("NewMebmer's request6" + i);

				mapper.insertReservation(reservation);
				log.info(member);
			} catch (Exception e) {
			}
		}

	}
	// OK

//	@Test
//	public void getListTest() {
//		log.info(mapper.getList());
//	}
	// OK

//	@Test
//	public void getListEachTest() {
//		log.info(mapper.getListEach(999L));
//	}
	// OK

//	@Test
//	public void updateReservationStatusTest() {
//		ReservationDTO res = new ReservationDTO();
//		res.setReservationId(6);
//		res.setReservationStatus("예약확정");
//		mapper.updateReservationStatus(res);
//	}
	// OK

//	@Test
//	public void insertWashingCompleteTest() {
//
//		ReservationConfirmedDTO confirm = new ReservationConfirmedDTO();
//		confirm.setConfirmId(1L);
//		
//		WashingCompleteDTO washingComplete = new WashingCompleteDTO();
//		washingComplete.setConfirm(confirm);
//		
//		mapper.insertWashingComplete(washingComplete);
//	}
	// OK
	
//	@Test
//	public void getListMember() throws Exception {
//		String username = "member@gmail.com";
//
//		mapper.getListMember(username);
//	}
	//OK
}
