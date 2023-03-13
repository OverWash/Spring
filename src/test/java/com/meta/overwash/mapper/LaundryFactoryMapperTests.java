package com.meta.overwash.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.LaundryFactoryDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class LaundryFactoryMapperTests {

	@Autowired
	private LaundryFactoryMapper lfMapper;

	@Test
	public void getLandryfactoryByAddr() {
		LaundryFactoryDTO lfdto = new LaundryFactoryDTO();
		lfdto.setFactoryAddress("파주시");
		LaundryFactoryDTO resultDto = lfMapper.getLaundryFactoryByAddr(lfdto);
		System.out.println(lfdto);
		System.out.println(resultDto);
	}
}
