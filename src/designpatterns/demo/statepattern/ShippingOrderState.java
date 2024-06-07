package designpatterns.demo.statepattern;

public class ShippingOrderState implements OrderState {

	@Override
	public void handleRequest() {
		System.out.println("Send Notification To User with Tracking ID");
		System.out.println("Initiate Logistic Patner to Update the Tracking Details Daily");
	}

}
