package com.meta.overwash.controller.rest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
					"file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@WebAppConfiguration
@Log4j
public class CheckRestControllerTest {

	@Autowired
	WebApplicationContext ctx;
	@Autowired
	MockMvc mock;
	
	@Before
	public void setup() { // 목 객체를 얻기 위한 작업.
		this.mock = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	@Test
	public void CheckListByConfirmId() throws Exception{
		log.info(
		mock.perform(MockMvcRequestBuilders.get("/check/1"))
		.andReturn()
		.getModelAndView()
		.getModelMap()
		);
	}

}
