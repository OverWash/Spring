package com.meta.overwash.mapper;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.UserDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml" })
@Log4j
public class ReservationConfirmedMapperTests {

	@Autowired
	ReservationConfirmedMapper rc;

//	@Test
//	public void getListTest() {
//		Criteria cri = new Criteria();
//		rc.getList(cri);
//	}

//	@Test
//	public void getCountTest() {
//		Criteria cri = new Criteria();
//		cri.setKeyword("예약확정");
//		rc.getCount(cri);
//	}
//	@Test
//	public void getCountToMember() {
//		UserDTO users = new UserDTO();
//		users.setUserId(1L);
//		rc.getCount(users);
//	}

	
	@Test
	public void getListToMember() {
		Criteria cri = new Criteria();
		HashMap<String, Object> vo = new HashMap<String, Object>();
		vo.put("pageNum", cri.getPageNum());
		vo.put("amount", cri.getAmount());
//		vo.put("userId", 1L); // 넣으면 고객의 예약확정리스트
		rc.getList(vo);
	}
}
