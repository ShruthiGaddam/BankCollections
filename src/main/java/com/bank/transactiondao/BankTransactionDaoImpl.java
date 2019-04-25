package com.bank.transactiondao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bank.model.Account;

public class BankTransactionDaoImpl implements BankTransactionDao{
	Map<Long, Account> accountEntry = new HashMap<Long, Account>();
	 Account account = new Account();
	Scanner sc = new Scanner(System.in);

//withdraw
	public int withdraw(Account account,int amt) {
		int i = 0;
		
			if (amt > account.getBalance()) {
				System.out.println("insufficient balance plz deposit");
			} 
			else {
				
				account.setBalance(account.getBalance()-amt);
				i=1;
			}

		
		if (i == 1)
			return i;
		else
			return 0;

	}

//deposit
	public int deposit(Account account,int amt) {
		int i = 1;
		
			account.setBalance(account.getBalance()+amt);
	
		if (i == 1)
			return i;
		else
			return 0;

	}

	//fund transfer
	public int fundTransfer(Account account, int amount, long toAccountNo, int amt) {
		// TODO Auto-generated method stub
		int i = 0;

		if (amt > amount) {
			System.out.println("insufficient balance plz deposit");
		} else {

			account.setBalance(amount - amt);
			for (Map.Entry<Long, Account> me : accountEntry.entrySet()) {

				if (toAccountNo == me.getKey()) {
					System.out.println("toAccount no. found");
					System.out.println(me.getKey());
					Account account2 = me.getValue();
					account2.setBalance(account2.getBalance() + amt);
					i++;
				}
			}

		}

		if (i == 1)
			return i;
		else
			return 0;
	}
	
	}
