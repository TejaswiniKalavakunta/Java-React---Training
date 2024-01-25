package com.hexaware.bankapp.myexceptions;

public class AccountNumberInvalidException extends Exception {
	
	public AccountNumberInvalidException(String message) {
		super(message+"Invalid Account Number");
	}


}
