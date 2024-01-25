package com.hexaware.myexceptions;

public class AccountNumberInvalidException extends Exception {
	
	public AccountNumberInvalidException(String message) {
		super(message+"Invalid Account Number");
	}


}
