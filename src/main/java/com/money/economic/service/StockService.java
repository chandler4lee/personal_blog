package com.money.economic.service;

public interface StockService {

	/**
	 * ���㲹��N�κ���Ҫ�����ʽ𣬲�������ÿ�β�������Ҫ�˽�Ĳ���
	 * @param original_price ԭʼ��λ
	 * @param stock_num ��ʼ��Ʊ������
	 * @param times ��Ҫ���ֵĴ���
	 * @param dilution_line �����ߣ�����10%,����10����
	 * */
	double dilutionStock(double original_price, int stock_num, int times , int dilution_line);

}
