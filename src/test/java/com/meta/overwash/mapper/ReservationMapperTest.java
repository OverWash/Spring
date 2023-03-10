package com.meta.overwash.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.ReservationDTO;

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

	@Test
	public void getListEachOneTest() throws Exception {
		ReservationDTO reservation = new ReservationDTO();
		MemberDTO member = new MemberDTO();

		reservation.setMember(memberMapper.getMember(999L));

		member.setMemberId(999L);
		reservation.setReservationId(1L);
		reservation.setMember(member);
		log.info("$$$$$$$$$$$$$$$$$$$$$$$:" + reservation.getReservationId());
		log.info("$$$$$$$$$$$$$$$$$$$$$$$:" + reservation.getMember().getMemberId());

		mapper.getListEachOne(reservation);

//		log.info(member);
	}

//	@Test
//	public void insertTest() {
//
//		try {
//			MemberDTO member = memberMapper.getMember(999L);
//			Date day = new Date();
//
//			ReservationDTO reservation = new ReservationDTO();
//			reservation.setMember(member);
//			reservation.setCollectDate(day);
//			reservation.setRequest("999의 테스트 요청입니다4");
//			reservation.setMember(member);
//
//			mapper.insertReservation(reservation);
//			log.info(member);
//		} catch (Exception e) {
//		}
//	}
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

}
