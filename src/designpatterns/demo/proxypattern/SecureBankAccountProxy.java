package designpatterns.demo.proxypattern;

import java.math.BigDecimal;

public class SecureBankAccountProxy implements BankAccount{
	
	private BigDecimal balance;
	
	public SecureBankAccountProxy(BigDecimal balance){
		this.balance = balance;
	}

	@Override
	public BigDecimal getBalance() {
		return this.balance;
	}

	@Override
	public BigDecimal withDraw(BigDecimal withDrawAmount) {
		System.out.println("Trying to WithDraw: "+ withDrawAmount);
		if(this.balance.compareTo(withDrawAmount) >= 0) {			
			RealBankAccount realBankAccount =  new RealBankAccount(this.balance);
			this.balance =  realBankAccount.withDraw(withDrawAmount);
			System.out.println("Remaining Balance: "+ this.balance);
			return this.balance;
		}
		System.out.println("Insufficient Balance: "+ withDrawAmount);
		throw new IllegalArgumentException("Insufficient Balance");
	}

	@Override
	public BigDecimal deposit(BigDecimal depositAmount) {
		RealBankAccount realBankAccount =  new RealBankAccount(this.balance);
		this.balance =  realBankAccount.deposit(depositAmount);
		System.out.println("Final Settlement Balance: "+ this.balance);
		return this.balance;
	}

}
