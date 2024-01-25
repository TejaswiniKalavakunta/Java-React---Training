package com.hexaware.bankapp.dao;

import com.hexaware.bankapp.dto.BankAccount;
import com.hexaware.bankapp.myexceptions.AccountNumberInvalidException;
import com.hexaware.bankapp.myexceptions.InsufficientFundsException;
import com.hexaware.bankapp.myexceptions.NegativeAmountException;

public interface IServiceProvider {

	public BankAccount  searchAccount(long accountNumber) throws AccountNumberInvalidException;
	public double checkBalance(long accountNumber) throws AccountNumberInvalidException;
	public boolean deposit(long accountNumber,double amount) throws AccountNumberInvalidException, NegativeAmountException;
	public boolean withdraw(long accountNumber,double amount) throws AccountNumberInvalidException, InsufficientFundsException, NegativeAmountException;
	public boolean removeAccount(long accountNumber) throws AccountNumberInvalidException;
	boolean createAccount(String holderName, String type, double balance);

}
