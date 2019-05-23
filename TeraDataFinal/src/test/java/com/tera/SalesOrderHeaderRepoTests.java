package com.tera;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.test.context.junit4.SpringRunner;
import com.tera.model.SalesOrderHeader;
import com.tera.repository.SalesOrderHeaderRepo;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SalesOrderHeaderRepoTests {
	@Autowired
	SalesOrderHeaderRepo sohRepo;

	@Test
	public void testSave() {
		SalesOrderHeader soh = new SalesOrderHeader();
		soh.setCreditCardApprovalCode("my Test Soh");
		sohRepo.save(soh);

		assertNotNull(soh.getBillToAddressId()); // not null after sav
		Optional<com.tera.model.SalesOrderHeader> item = sohRepo.findById((long) 1);
		assertEquals("my Test Soh", item.get().getCreditCardApprovalCode());

		long sohCount = sohRepo.count();
		assertEquals(sohCount, 1);

		Iterable<SalesOrderHeader> salesOrderHeader = sohRepo.findAll();
		int count = 0;
		for (SalesOrderHeader iter : salesOrderHeader) {
			count++;
		}
		assertEquals(count, 1);

		soh.setCreditCardApprovalCode("my new Test Soh");
		sohRepo.save(soh);
		item = sohRepo.findById((long) 1);
		assertEquals("my new Test Soh", item.get().getCreditCardApprovalCode());

		sohRepo.delete(soh);
		item = sohRepo.findById((long) 1);
		assertEquals(Optional.empty(), item);

	}

	@Test
	public void nativeQueries() {
		//   @Query(value="select sum(totaldue) from Dice_RDM.SalesOrderHeader group by 
		////EXTRACT(year FROM shipdate)",nativeQuery=true)
		Date d = new Date();
		SalesOrderHeader soh = new SalesOrderHeader();
		soh.setTotaldue(45);
		soh.setShipDate( d);
		sohRepo.save(soh);

		List<Double> sumTotal = sohRepo.sumTotalDue();
		
	//	assertEquals(45, sumTotal.get(0).doubleValue());
		//assertNotNull(soh.getBillToAddressId()); // not null after sav


	}



}
