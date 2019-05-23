package com.tera;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.tera.repository.SalesOrderHeaderRepo;
import com.tera.services.SalesOrderHeaderService;
import com.tera.services.SalesOrderHeaderServiceImpl;

import static org.mockito.Mockito.when;


import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class SalesOrderHeaderTest {
	@InjectMocks
	private SalesOrderHeaderServiceImpl salOrderHeaderService;
	@Mock
	private 	SalesOrderHeaderRepo  sOHRepo;


	@Test
	public void sumByFrieght() {
		List<Double>  sumByFrieghtList = new ArrayList<Double>();
		sumByFrieghtList.add(22.45);
		sumByFrieghtList.add(20.45);
		
		when(sOHRepo.sumTotalDue()).thenReturn( sumByFrieghtList);
		List<Double>  sumByFrieghtListTest  =salOrderHeaderService.sumByTotlaDue();
		
		assertEquals(sumByFrieghtList, sumByFrieghtListTest);
	
	}
	
	@Test
	public void qoqCountByShipmentDate() {
		List<Double>  sumByFrieghtList = new ArrayList<Double>();
		sumByFrieghtList.add(22.45);
		sumByFrieghtList.add(20.45);
		
		when(sOHRepo.qoqCountByShipmentDate()).thenReturn( sumByFrieghtList);
		List<Double>  sumByFrieghtListTest  =salOrderHeaderService.qoqCountByShipmentDate();
		
		assertEquals(sumByFrieghtList, sumByFrieghtListTest);
	
	}

}
