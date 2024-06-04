package designpatterns.demo.mediatorpattern;

import javax.naming.SizeLimitExceededException;

public interface Flights {

	public void requestLanding() throws SizeLimitExceededException;
	
	public void requestTakeOff() throws SizeLimitExceededException;
	
	public void receiveMessage(String message);
	
	public void sendMessageToOtherPlane(String message);
	
	public boolean checkAvailablePlatform();
}
