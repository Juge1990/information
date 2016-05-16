package com.micheal.vegetable.information.model;

import java.util.List;

public class Vegetable {
	String name;
	Price price;
	List<Price> historicalPrice;
	VestingPeriod period;
	int yield;
	public Vegetable(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public VestingPeriod getPeriod() {
		return period;
	}
	public void setPeriod(VestingPeriod period) {
		this.period = period;
	}
	public int getYield() {
		return yield;
	}
	public void setYield(int yield) {
		this.yield = yield;
	}
	public List<Price> getHistoricalPrice() {
		return historicalPrice;
	}
	public void setHistoricalPrice(List<Price> historicalPrice) {
		this.historicalPrice = historicalPrice;
	}
	
}
