package designpatterns.demo.observerpattern;

public interface StockMarket {
	
	public void register(StockAlertSubscriber stockAlert);
	
	public void unregister(StockAlertSubscriber stockAlert);
	
	public void notifyObservers();

}
