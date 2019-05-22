package com.tera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tera.model.SalesOrderHeader;

	@Repository
	public interface SalesOrderHeaderRepo extends PagingAndSortingRepository<SalesOrderHeader, Long>
	{ 


		////  This is final implementation 
	    @Query(value="select sum(totaldue) from Dice_RDM.SalesOrderHeader group by EXTRACT(year FROM shipdate)",nativeQuery=true)
	    List<Double> sumTotalDue();

	    @Query(value="select count(shipdate)  from Dice_RDM.SalesOrderHeader where   shipdate between current_date- INTERVAL '3' YEAR  and CURRENT_DATE",nativeQuery=true)
	    Double countByShipmentDate();

		/// what is qoq sale for last 3 years 
		 @Query(value="SELECT     count(shipdate)     from Dice_RDM.SalesOrderHeader   group by   EXTRACT(year FROM shipdate),  ((CAST(EXTRACT(MONTH FROM shipdate) AS BYTEINT)-1)/3)+1",nativeQuery=true)
	    List<Double> qoqCountByShipmentDate();
		
	    
		 
		 
		 
		 
		 /*@Query("SELECT sum(totaldue) from SalesOrderHeader ")
	    double SumTotlaDue();
	    @Modifying
	    */
	    
	     

	}
