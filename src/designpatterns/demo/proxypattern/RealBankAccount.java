package designpatterns.demo.proxypattern;

import java.math.BigDecimal;

public class RealBankAccount implements BankAccount{
	
	private BigDecimal balance;
	
	protected RealBankAccount(BigDecimal balance) {
		this.balance = balance;
	}
	
	@Override
	public BigDecimal getBalance() {
		return this.balance;
	}

	@Override
	public BigDecimal withDraw(BigDecimal withDrawAmount) {
		return this.balance.subtract(withDrawAmount);
	}

	@Override
	public BigDecimal deposit(BigDecimal depositAmount) {
		return this.balance.add(depositAmount);
	}

}
