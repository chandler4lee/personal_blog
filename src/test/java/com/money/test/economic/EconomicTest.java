package com.money.test.economic;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.money.economic.service.StockService;
import com.money.test.BaseTest;

public class EconomicTest extends BaseTest{

	@Autowired
	private StockService stockService;
	
	@Test
	public void ConculateStock(){
		double cost = stockService.dilutionStock(7.94 , 200 , 1 , 5);
		System.out.println(cost);
	}
	
}
