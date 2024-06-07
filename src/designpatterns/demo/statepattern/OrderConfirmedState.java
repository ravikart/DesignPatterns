package designpatterns.demo.statepattern;

public class OrderConfirmedState implements OrderState{

	@Override
	public void handleRequest() {
		System.out.println("Order Confirmed!");
		System.out.println("Send Mail and Email Notification with Order Confirmation ID.");
		System.out.println("Initiate Logistic Pickup");
	}

}
