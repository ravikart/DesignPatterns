package designpatterns.demo.observerpattern;

import java.util.LinkedList;
import java.util.List;

public class StockMarketImplementation implements StockMarket{
	
	private List<StockAlertSubscriber> observerList =  new LinkedList<StockAlertSubscriber>();
	private String stockPrice;

	@Override
	public void register(StockAlertSubscriber stockAlert) {
		observerList.add(stockAlert);
	}

	@Override
	public void unregister(StockAlertSubscriber stockAlert) {
		observerList.remove(stockAlert);		
	}

	@Override
	public void notifyObservers() {
		observerList.stream().forEach((value) -> {
			value.update(stockPrice);
		});
	}
	
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
		notifyObservers();
	}

}
