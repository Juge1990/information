package com.micheal.vegetable.information.dao;

import java.util.List;

import com.micheal.vegetable.information.model.Vegetable;

public interface VegetableDao {

	public Vegetable getVegetableByName(String name);
	public List<Vegetable> getVegetableList();
	
}
