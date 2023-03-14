package com.meta.overwash.mapper;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class PaymentRequestMapperTest {

	@Autowired
	PaymentRequestMapper prMapper;

	@Autowired
	UserMapper um;
//	@Test
//	public void InsertprMapper() {
//		PaymentRequestDTO prdto = new PaymentRequestDTO();
//		prdto.setPrPrice(30000);
//		prdto.setConfirm(new ReservationConfirmedDTO(1L, Timestamp.valueOf("2022-09-30 00:00:00"), null, null, null));
//		prMapper.insertPaymentRequest(prdto);
//	}

//	@Test
//	public void getListToMember() {
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		Criteria cri = new Criteria();
//		map.put("pageNum", (long) cri.getPageNum());
//		map.put("amount", (long) cri.getAmount());
//		map.put("userId", 5L);
//		prMapper.getListToMember(map);
//
//	}
//	@Test
//	public void getCountToMemerTest() {
//		UserDTO users=um.getUser("member5@gmail.com");
//		prMapper.getCountToMember(users);
//	}
	
	@Test
	public void getListToMemberNotPaging() {
		prMapper.getListToMemberNotPaging(4L);
	}
}
