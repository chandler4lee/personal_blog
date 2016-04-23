package com.money.economic.service;

public interface StockService {

	/**
	 * 计算补仓N次后，需要多少资金，并且声称每次操作后需要了解的参数
	 * @param original_price 原始价位
	 * @param stock_num 起始股票的数量
	 * @param times 想要补仓的次数
	 * @param dilution_line 补仓线，比如10%,传入10即可
	 * */
	double dilutionStock(double original_price, int stock_num, int times , int dilution_line);

}
