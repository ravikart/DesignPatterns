package designpatterns.demo.runner;

import designpatterns.demo.observerpattern.EmailNotification;
import designpatterns.demo.observerpattern.StockMarketImplementation;
import designpatterns.demo.observerpattern.UserAlert;

public class ObserverDesignPatternRunner {
	
//	Suppose you’re building a stock market monitoring application. 
//	The application tracks real-time stock prices for various companies. 
//	You want to implement an observer pattern to notify users when 
//	the stock price of a specific company crosses a certain threshold
	
	public static void main(String[] args) {
		
		UserAlert userAlert =  new UserAlert();
		
		EmailNotification notification = new EmailNotification();
		
		StockMarketImplementation stockMarket =  new StockMarketImplementation();
		
		stockMarket.register(userAlert);
		stockMarket.register(notification);
		
		stockMarket.setStockPrice("80.89");
		
		stockMarket.unregister(notification);
		
		stockMarket.setStockPrice("90");
		
		
	}

}
