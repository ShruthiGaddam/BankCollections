package com.bank.userException;

public class InvalidMobileNoException extends Exception {
	public InvalidMobileNoException()
	{
		System.err.println("Mobile No should be 10 digits");
	}
}
