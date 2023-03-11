package com.meta.overwash.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.ReservationConfirmedDTO;
import com.meta.overwash.domain.ReservationDTO;
import com.meta.overwash.domain.WashingCompleteDTO;
import com.meta.overwash.mapper.ReservationMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class ReservationServiceTests {
	
	@Autowired
	private ReservationService service;
	
	@Autowired
	ReservationMapper mapper;
	
//	@Test
//	public void getListTest() {
//		service.getList().forEach(reservation -> log.info(reservation));
//	}
	// OK
	
//	@Test
//	public void getListEachTest() {
//		service.getListEach(1L).forEach(reservation -> log.info(reservation));
//	}
	//OK
	
	
//	public void updateReservationStatus(ReservationDTO reservation) {
//		mapper.updateReservationStatus(reservation);
//	}
//	@Test
//	public void registerWashingComplete() {
//		ReservationDTO reservation = new ReservationDTO();
//		reservation.setReservationId(4L);
//		ReservationConfirmedDTO confirm = new ReservationConfirmedDTO();
//		confirm.setConfirmId(1L);
//		confirm.setReservation(reservation);
//		WashingCompleteDTO washingComplete = new WashingCompleteDTO();
//		washingComplete.setConfirm(confirm);
//		
//		
//		mapper.insertWashingComplete(washingComplete);
//		
//		reservation.setReservationStatus("세탁완료 테스트");
//		updateReservationStatus(reservation);
//	}
	//OK
	@Test
	public void getListMemberTest() {
		String username = "member@gmail.com";
		service.getListMember(username).forEach(reservations -> log.info(reservations));
	}
}
