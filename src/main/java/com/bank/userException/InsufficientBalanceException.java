package com.bank.userException;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException()
	{
		System.err.println("Insufficient amount in your account");
	}
}
