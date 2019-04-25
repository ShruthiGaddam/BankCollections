package com.bank.userException;

public class InvalidAccountException extends Exception{
		public InvalidAccountException() {
			System.err.println("account number is not valid.");
		}
}
