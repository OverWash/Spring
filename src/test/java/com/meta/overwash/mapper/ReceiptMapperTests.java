package com.meta.overwash.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class ReceiptMapperTests {
	
	@Autowired
	private ReceiptMapper receiptMapper;
	
	@Test
	public void getReceiptListTest() {
		log.info(receiptMapper.getReceiptList(4L));
	}
	
//	@Test
//	public void getReceiptTest() {
//		log.info(receiptMapper.getReceipt(1L));
//	}
		
}
