package designpatterns.demo.statepattern;

public class DeliveredOrderState implements OrderState {

	@Override
	public void handleRequest() {
		System.out.println("Product is Delivered!");
		System.out.println("Initiate Feedback after 10days to know the User Review.");
	}

}
