package designpatterns.demo.observerpattern;

public interface StockAlertSubscriber {
	
	public void update(String stockPrice);

}
