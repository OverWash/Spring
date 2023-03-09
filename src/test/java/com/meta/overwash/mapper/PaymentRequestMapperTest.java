package com.meta.overwash.mapper;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.PaymentRequestDTO;
import com.meta.overwash.domain.ReservationConfirmedDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class PaymentRequestMapperTest {

	@Autowired
	PaymentRequestMapper prMapper;

	@Test
	public void InsertprMapper() {
		PaymentRequestDTO prdto = new PaymentRequestDTO();
		prdto.setPrPrice(30000);
		prdto.setConfirm(new ReservationConfirmedDTO(1, Timestamp.valueOf("2022-09-30 00:00:00"), null, null, null));
		prMapper.insertPaymentRequest(prdto);
	}
}
