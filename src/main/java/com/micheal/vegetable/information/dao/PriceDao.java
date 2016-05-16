package com.micheal.vegetable.information.dao;

import java.util.Date;
import java.util.List;

import com.micheal.vegetable.information.model.Price;

public interface PriceDao {
	public Price getLatestPrice(String name);
	
	public List<Price> getPrices(String name, Date start, Date end);
	
	
}
