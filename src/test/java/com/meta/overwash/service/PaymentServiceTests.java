package com.meta.overwash.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
					"file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@Log4j
public class PaymentServiceTests {

	@Autowired
	private PaymentService paymentService;
	
//	@Test
//	public void getReceiptDetailTest() {
//		HashMap<String, Object> receipts = new HashMap<>(); 
//		receipts = paymentService.getReceiptDetail(1L);
//	    
//		System.out.println("TEST!!!!!!!!!!!!!");
//		for (Entry<String, Object> entrySet : receipts.entrySet()) {
//            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
//        }
//	}
	
}
