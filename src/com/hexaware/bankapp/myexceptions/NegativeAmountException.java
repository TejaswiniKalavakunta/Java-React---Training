package com.hexaware.bankapp.myexceptions;

public class NegativeAmountException extends Exception {
	
	public NegativeAmountException(String message) {
		super(message+"Balance cannot be negative");
	}

}
