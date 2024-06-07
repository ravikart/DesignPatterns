package designpatterns.demo.observerpattern;

public class EmailNotification implements StockAlertSubscriber{

	@Override
	public void update(String stockPrice) {
		System.out.println("Email Notification");
		sendMail(stockPrice);
	}

	private void sendMail(String stockPrice) {
		System.out.println("!Important, Stock Price update: " + stockPrice);
	}

}
