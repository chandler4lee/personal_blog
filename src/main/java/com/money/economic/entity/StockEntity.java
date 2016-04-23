package com.money.economic.entity;

public class StockEntity {
	
	/**
	 * 买入价格
	 * */
	private double original_price;
	/**
	 * 下次补仓的成本价
	 * */
	private double next_price;
	/**
	 * 必须买入的股票数量
	 * */
	private int stock_num;
	/**
	 * 下次补仓买入的股票数量
	 * */
	private int next_stock_num;
	/**
	 * 买入后需要花费的本金
	 * */
	private double cost;
	/**
	 * 下次买入后需要花费的本金
	 * */
	private double next_cost;
	/**
	 * 买股票累计的金额
	 * */
	private double total_cost;
	
	@Override
	public String toString() {
		
		String str = "买入价格:"+this.getOriginal_price() +"  " + 
		"必须买入的股票数量:" + this.getStock_num() +"  " + 
		"买入后需要花费的本金:" + this.getCost() +"  " + 
		"下次补仓的成本价:" + this.getNext_price() +"  " + 
		"下次补仓买入的股票数量:" + this.getNext_stock_num() +"  " + 
		"下次买入后需要花费的本金:" + this.getNext_cost() +"  " + 
		"买股票累计的金额:" + this.getTotal_cost() + " \r\n \r\n ";
				
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
