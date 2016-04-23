package com.money.economic.entity;

public class StockEntity {
	
	/**
	 * ����۸�
	 * */
	private double original_price;
	/**
	 * �´β��ֵĳɱ���
	 * */
	private double next_price;
	/**
	 * ��������Ĺ�Ʊ����
	 * */
	private int stock_num;
	/**
	 * �´β�������Ĺ�Ʊ����
	 * */
	private int next_stock_num;
	/**
	 * �������Ҫ���ѵı���
	 * */
	private double cost;
	/**
	 * �´��������Ҫ���ѵı���
	 * */
	private double next_cost;
	/**
	 * ���Ʊ�ۼƵĽ��
	 * */
	private double total_cost;
	
	@Override
	public String toString() {
		
		String str = "����۸�:"+this.getOriginal_price() +"  " + 
		"��������Ĺ�Ʊ����:" + this.getStock_num() +"  " + 
		"�������Ҫ���ѵı���:" + this.getCost() +"  " + 
		"�´β��ֵĳɱ���:" + this.getNext_price() +"  " + 
		"�´β�������Ĺ�Ʊ����:" + this.getNext_stock_num() +"  " + 
		"�´��������Ҫ���ѵı���:" + this.getNext_cost() +"  " + 
		"���Ʊ�ۼƵĽ��:" + this.getTotal_cost() + " \r\n \r\n ";
				
		return str;
		
	};
	
	public double getOriginal_price() {
		return original_price;
	}
	public void setOriginal_price(double original_price) {
		this.original_price = original_price;
	}
	public int getStock_num() {
		return stock_num;
	}
	public void setStock_num(int stock_num) {
		this.stock_num = stock_num;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	public double getNext_price() {
		return next_price;
	}
	public void setNext_price(double next_price) {
		this.next_price = next_price;
	}
	public int getNext_stock_num() {
		return next_stock_num;
	}
	public void setNext_stock_num(int next_stock_num) {
		this.next_stock_num = next_stock_num;
	}
	public double getNext_cost() {
		return next_cost;
	}
	public void setNext_cost(double next_cost) {
		this.next_cost = next_cost;
	}
}
