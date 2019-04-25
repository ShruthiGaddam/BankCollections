package com.bank.registerationlogindao;

import com.bank.model.Account;

public interface BankRegistrationDao {
	public Account login(long accountNo,String password);
	public long registration(Account account);
	public int fundTransfer(Account account,int amount,long toAccountNo,int amt);
}
