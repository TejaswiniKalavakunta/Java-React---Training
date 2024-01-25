package com.hexaware.bankapp.myexceptions;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException(String message) {
		super(message+"Insufficient Funds");
	}

}
