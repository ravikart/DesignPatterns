package designpatterns.demo.observerpattern;

public class UserAlert implements StockAlertSubscriber{

	@Override
	public void update(String stockPrice) {
		System.out.println("User Alert");
		displayInMessage(stockPrice);
	}

	private void displayInMessage(String stockPrice) {
		System.out.println("Received StockPrice Update from Stock Market Class: " + stockPrice);
	}
	

}
