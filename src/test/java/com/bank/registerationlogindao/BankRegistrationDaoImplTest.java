package com.bank.registerationlogindao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.bank.model.Account;

class BankRegistrationDaoImplTest {

	static Account account=new Account();
	static BankRegistrationDao dao=new BankRegistrationDaoImpl();
	
	
	@Test
	void registration() {
		 Account account = new Account();		
		 account.setAadharNo(123654789654L);
		account.setFirstName("shruthi");
		account.setLastName("gaddam");
		account.setEmailId("shruthi@gmail.com");
		account.setPancardNo("1234");
		account.setMobileNo(9087654312L);
		account.setPassword("shruthi");
		account.setAddress("hyd");
		Random r=new Random();
		long accountNo= Math.abs(r.nextLong());
		account.setAccountNo(accountNo);
		long accNo= dao.registration(account);
		assertEquals(accountNo,accNo);

	}
	
	
	@Test
	void login() {
		Random r=new Random();
		long accountNo= Math.abs(r.nextLong());
		account.setAccountNo(accountNo);
		account.setPassword("shruthi");
		Account acc1=dao.login(account.getAccountNo(),account.getPassword());
		 Account acc =dao.login(accountNo,"shruthi"); 
		 assertEquals(acc1, acc);
		 
		 
	}
}
