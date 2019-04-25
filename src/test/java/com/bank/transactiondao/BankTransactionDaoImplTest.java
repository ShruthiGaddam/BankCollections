package com.bank.transactiondao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bank.model.Account;

class BankTransactionDaoImplTest {

	static BankTransactionDaoImpl test=new BankTransactionDaoImpl();
	static Account account = new Account();	

	
	
	@Test
	public void testDeposit() {
		account.setAadharNo(123456789012L);
		account.setFirstName("shruthi");
		account.setLastName("gaddam");
		account.setEmailId("shruthi@gmail.com");
		account.setPancardNo("1234");
		account.setMobileNo(9087654312L);
		account.setPassword("shruthi");
		account.setAddress("hyd");

		assertEquals(1, test.deposit(account, 1000));

	}

	@Test
	 void testWithdraw() {
		 account.setBalance(500);
	 assertEquals(1, test.withdraw(account, 50));
	 }
	
	@Test
	void testFundTransfer() {
					assertEquals(0,test.fundTransfer(account,300,1000000, 100));
				}




}
