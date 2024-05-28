package designpatterns.demo.runner;

import java.math.BigDecimal;

import designpatterns.demo.proxypattern.BankAccount;
import designpatterns.demo.proxypattern.SecureBankAccountProxy;

public class ProxyDesignPatternRunner {
	
//	You are tasked with implementing a secure bank account system. 
//	The system should allow clients to deposit and withdraw funds from 
//	their accounts while ensuring proper access control and additional security features.

	public static void main(String[] args) {
		
		BankAccount bankAccount =  new SecureBankAccountProxy(new BigDecimal(100000));
		
		System.out.println(bankAccount.getBalance());
		System.out.println(bankAccount.deposit(new BigDecimal(10000)));
		System.out.println(bankAccount.withDraw(new BigDecimal(200000)));
		

	}

}
