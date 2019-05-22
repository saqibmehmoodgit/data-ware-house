package com.tera.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tera.services.SalesOrderHeaderService;
import com.tera.services.SalesOrderHeaderServiceImpl;

@RestController
@RequestMapping(value = "/getSalesOrder")
public class SalesOrderHeaderController {

	@Autowired
	SalesOrderHeaderServiceImpl salesOrderHeaderService;

	@RequestMapping(value = "/getSumByTotalDue", method = RequestMethod.GET) //
	@ResponseBody
	public List<Double> sumFrieght() {

		
		return  salesOrderHeaderService.sumByTotlaDue();
	}

	@RequestMapping(value = "/getQuarterCountByShipmentDate", method = RequestMethod.GET) //
	@ResponseBody
	public List<Double> qoqCountByShipmentDate() {

		
		return  salesOrderHeaderService.qoqCountByShipmentDate();
	}
	@RequestMapping(value = "/getCountByShipmentDate", method = RequestMethod.GET) //
	@ResponseBody
	public Double countByShipmentDate() {

		
		return  salesOrderHeaderService.countByShipmentDate();
	}

	

}
