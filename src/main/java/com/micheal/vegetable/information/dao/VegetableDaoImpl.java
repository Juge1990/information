package com.micheal.vegetable.information.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.micheal.vegetable.information.model.Price;
import com.micheal.vegetable.information.model.Vegetable;
import com.micheal.vegetable.information.model.VestingPeriod;

public class VegetableDaoImpl implements VegetableDao {
	private PriceDao priceDao;
	public Vegetable getVegetableByName(String name) {
		Vegetable vegetable = getVegetable(name);
		if(vegetable==null){
			return null;
		}
		Price price = priceDao.getLatestPrice(name);
		List<Price> historicalPrice = priceDao.getPrices(name, new Date(), new Date());
		vegetable.setPrice(price);
		vegetable.setHistoricalPrice(historicalPrice);
		return vegetable;
	}
	private Vegetable getVegetable(String name) {
		VestingPeriod period = new VestingPeriod("5", "10");
		Price price = new Price(new Date(), 0.3f);
		Vegetable vegetable = new Vegetable(name);
		vegetable.setPeriod(period);
		vegetable.setPrice(price);
		return vegetable;
	}
	
	
	public List<Vegetable> getVegetableList() {
		List<Vegetable> vegetables = new ArrayList<Vegetable>();
		for(int i = 0; i<10; i++){
			vegetables.add(new Vegetable("vegetable"+i));
		}
		return vegetables;
	}

}
