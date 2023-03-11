package com.meta.overwash.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.ReservationConfirmedDTO;
import com.meta.overwash.domain.ReservationDTO;
import com.meta.overwash.domain.WashingCompleteDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReservationMapperTest {
	
	@Autowired
	ReservationMapper mapper;
	
//	@Test
//	public void insertTest() {
//		MemberDTO member = new MemberDTO();
//		member.setMemberId(999L);
//		Date day = new Date();
	
//		ReservationDTO reservation = new ReservationDTO();
	
//		reservation.setCollectDate(day);
//		reservation.setRequest("테스트 요청입니다.999의");
////		reservation.setLaundryType("일반세탁");
//		reservation.setMember(member);
//		
//		mapper.insertReservation(reservation);
//		log.info(member);
//	}
	//OK
	
//	@Test
//	public void getListTest() {
//		log.info(mapper.getList());
//	}
	//OK
	
//	@Test
//	public void getListEachTest() {
//		log.info(mapper.getListEach(1L));
//	}
	//OK
	
//	@Test
//	public void updateReservationStatusTest() {
//		ReservationDTO res = new ReservationDTO();
//		res.setReservationId(6);
//		res.setReservationStatus("예약확정");
//		mapper.updateReservationStatus(res);
//	}
	//OK
	
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
	//OK
	
}
