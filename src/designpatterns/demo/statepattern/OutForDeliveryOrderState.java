package designpatterns.demo.statepattern;

public class OutForDeliveryOrderState implements OrderState{

	@Override
	public void handleRequest() {
		System.out.println("Generate OTP");
		System.out.println("Send Notification about the delivery notes to Logictic Patner");
		System.out.println("Send Notification to User with OTP");
	}

}
