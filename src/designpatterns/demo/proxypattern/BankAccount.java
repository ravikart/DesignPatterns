package designpatterns.demo.proxypattern;

import java.math.BigDecimal;

public interface BankAccount {
	
	public BigDecimal getBalance();
	
	public BigDecimal withDraw(BigDecimal withDrawAmount);
	
	public BigDecimal deposit(BigDecimal depositAmount);

}
