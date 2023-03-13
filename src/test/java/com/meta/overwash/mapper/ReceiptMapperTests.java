package com.meta.overwash.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.PaymentRequestDTO;
import com.meta.overwash.domain.ReceiptDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class ReceiptMapperTests {
	
	@Autowired
	private ReceiptMapper receiptMapper;
	
	@Autowired
	private PaymentRequestMapper prMapper;
	
	
//	@Test
//	public void getReceiptListTest() {
//		log.info(receiptMapper.getReceiptList(4L));
//	}
	
//	@Test
//	public void getReceiptTest() {
//		log.info(receiptMapper.getReceipt(1L));
//	}
	
//	@Test
//	public void insertReceiptTest() {
//		ReceiptDTO receipt = new ReceiptDTO();
//		receipt.setPaymentMethod("카드");
//		receipt.setReceiptId(1L);
//		PaymentRequestDTO pr = prMapper.getPaymentRequest(1L);
//		receipt.setPr(pr);
//		log.info(receipt);
//		
//		
//		receiptMapper.insertReceipt(receipt);
//		
//	}
		
}
