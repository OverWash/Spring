package com.meta.overwash.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.ReservationConfirmedDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class CheckMapperTests {

	@Autowired
	CheckMapper checkMapper;

	@Test
	public void checkListByConfirmId() {
		ReservationConfirmedDTO rcDto = new ReservationConfirmedDTO();
		rcDto.setConfirmId(1L);
		checkMapper.getListByConfirmId(rcDto);

	}

}
