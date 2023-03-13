package com.meta.overwash.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.mapper.MemberMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class PaymentServiceTests {

	@Autowired
	PaymentService paymentService;

	@Autowired
	MemberMapper mm;

	@Autowired
	MemberService memberService;

//	@Test
//	public void insertPaymentService() {
//		
//		//테스트를 하기 위해 LAUNDRYPRICE를 강제로 넣어줬지만 원래는 VIEW에서 값이 넘어올 것임
//		
//		List<LaundryDTO> dtoList = new ArrayList<LaundryDTO>();
//		IntStream.range(1, 8).forEach(i -> {
//			LaundryDTO ld = new LaundryDTO();
//			ld.setLaundryId(i);
//			LaundryPriceDTO laundryPrice = new LaundryPriceDTO();
//			laundryPrice.setPrice(i * 3000);
//			ld.setLaundryPrice(laundryPrice);
//			dtoList.add(ld);
//		});
//		paymentService.requestToAdmin(2L, dtoList);
//	}

//	@Test
//	public void getListToAdminTest() {
//		Criteria cri = new Criteria();
//		paymentService.getListToAdmin(cri);
//	}

	@Test
	public void getListToMemberTest() throws Exception {

		Criteria cri = new Criteria();
		paymentService.getListToMember(cri, 4L);
	}

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
