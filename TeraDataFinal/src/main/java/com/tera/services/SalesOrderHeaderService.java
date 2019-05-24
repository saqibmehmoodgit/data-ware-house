package com.tera.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tera.repository.SalesOrderHeaderRepo;

public interface SalesOrderHeaderService 
{
	
public	List<Double> sumByTotlaDue();
public	List<Double> qoqCountByShipmentDate();
public	Double countByShipmentDate()  ;	





	
}
