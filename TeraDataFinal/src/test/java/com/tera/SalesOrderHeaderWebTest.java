package com.tera;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.tera.repository.*;
import com.tera.services.SalesOrderHeaderService;
import com.tera.services.SalesOrderHeaderServiceImpl;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:application-h2.properties")
@SpringBootTest
public class SalesOrderHeaderWebTest {

	private MockMvc mockMvc;

	@MockBean
	private SalesOrderHeaderServiceImpl salOrderHeaderService;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetQuarterCountByShipmentDate() throws Exception {

		List<Double> sumByTotlaDue = new ArrayList<Double>();
		sumByTotlaDue.add(45D);
		when(salOrderHeaderService.qoqCountByShipmentDate()).thenReturn(sumByTotlaDue);

		RequestBuilder request = MockMvcRequestBuilders
				.get("http://localhost:8080/getSalesOrder/getQuarterCountByShipmentDate")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().json("[45.0]", false)).andReturn();

	}

	@Test
	public void testGetMethod() throws Exception {

		List<Double> sumByTotlaDue = new ArrayList<Double>();
		sumByTotlaDue.add(45D);
		when(salOrderHeaderService.sumByTotlaDue()).thenReturn(sumByTotlaDue);

		RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/getSalesOrder/getSumByTotalDue")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().json("[45.0]", false)).andReturn();

	}

}

///assertEquals("ALLAH KAREEM", result.getResponse().getContentAsString());
//assertEquals(12100, result.getResponse().getContentAsString());
