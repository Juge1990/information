package com.micheal.vegetable.information.model;

public class VestingPeriod {
	String startTime;
	String endTime;
	public VestingPeriod(String startTime, String endTime){
		this.startTime = startTime;
		this.endTime = endTime;
	}
	boolean isInVestingPeriod(){
		return false;
	};

}
