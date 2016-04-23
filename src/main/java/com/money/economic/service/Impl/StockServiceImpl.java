package com.money.economic.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.money.economic.entity.StockEntity;
import com.money.economic.service.StockService;

@Service("stockService")
public class StockServiceImpl implements StockService {

	public double dilutionStock(double original_price, int stock_num, int times , int dilution_line) {
		double cost = 0;
		List<StockEntity> stockInfos = new ArrayList<StockEntity>();
		StockEntity s = new StockEntity();
		s.setOriginal_price(original_price);
		s.setStock_num(stock_num);
		s.setCost(original_price * stock_num);
		
		s.setNext_price(original_price - original_price * dilution_line * 0.01);
		s.setNext_stock_num(s.getStock_num());
		s.setNext_cost(s.getNext_price() * s.getNext_stock_num());
		
		s.setTotal_cost(s.getCost() + s.getNext_cost());
		stockInfos.add(s);
		System.out.println(s.toString());
		
		for (int i = 0; i <= (times - 2); i++) {
			StockEntity entity = new StockEntity();
			entity.setOriginal_price(stockInfos.get(i).getNext_price());
			entity.setStock_num(stockInfos.get(i).getNext_stock_num());
			entity.setCost(entity.getOriginal_price() * entity.getStock_num());
			
			entity.setNext_price(entity.getOriginal_price() - entity.getOriginal_price() * dilution_line * 0.01);
			entity.setNext_stock_num(entity.getStock_num() * 2);
			entity.setNext_cost(entity.getNext_price() * entity.getNext_stock_num());
			
			entity.setTotal_cost(entity.getCost() + entity.getNext_cost());
			stockInfos.add(entity);
			System.out.println(entity.toString());
		}
		
		cost = stockInfos.get(stockInfos.size() - 1).getTotal_cost();
		return cost;
	}

}
