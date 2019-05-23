package com.tera.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tera.repository.SalesOrderHeaderRepo;

@Service
public class SalesOrderHeaderServiceImpl  // implements SalesOrderHeaderService
{

	@Autowired
	SalesOrderHeaderRepo  sOHRepo;
	
public	List<Double> sumByTotlaDue()
{

	return sOHRepo.sumTotalDue();
}
public	List<Double> qoqCountByShipmentDate()
{

	return sOHRepo.qoqCountByShipmentDate();
}
public	Double countByShipmentDate()  
{

	return sOHRepo.countByShipmentDate();
}
	





	
}
