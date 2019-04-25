package com.bank.transactionService;

import com.bank.model.Account;
import com.bank.transactiondao.BankTransactionDaoImpl;

public class BankTransactionServiceImpl implements BankTransactionService{

	static BankTransactionDaoImpl transdao=new BankTransactionDaoImpl();
	static Account account=new Account();
	
	
	public int withdraw(Account account,int amt) {
		int m=transdao.withdraw(account,amt);
		return m;
	}

	public int deposit(Account account,int amt) {
		int n=transdao.deposit(account,amt);
		return n;
	}


	public boolean validateAadhar(long aadharNo) {
		long n=aadharNo;
		
		if(Long.toString(n).length()==12)
			
			return true;	
		
		
	else
		return false;
	}
	public boolean validateMobile(long mobileNo) {
		long n=mobileNo;
		
		if(Long.toString(n).length()==10)
			
			return true;	
		
		
	else
		return false;
	}
	
	public boolean sufficientBalance(int bal) {
		
		if(account.getBalance()<bal) {
			return true;
		}
		return false;
		
	}
	
	
public boolean validateAcNo(long accNo) {
		
		if(account.getAccountNo()==accNo) {
			return true;
		}
		return false;
		
	}
}
