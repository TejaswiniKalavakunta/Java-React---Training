package com.hexaware.myexceptions;

public class NegativeAmountException extends Exception {
	
	public NegativeAmountException(String message) {
		super(message+"Balance cannot be negative");
	}

}
