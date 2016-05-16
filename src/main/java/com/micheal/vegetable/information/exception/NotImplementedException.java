package com.micheal.vegetable.information.exception;

public class NotImplementedException extends Exception {
	String errorMsg;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 825502064312234581L;
	public NotImplementedException(String errorMsg){
		super(errorMsg);
	}
}
