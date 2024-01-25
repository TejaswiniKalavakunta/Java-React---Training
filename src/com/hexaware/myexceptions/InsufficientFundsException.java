package com.hexaware.myexceptions;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException(String message) {
		super(message+"Insufficient Funds");
	}

}
