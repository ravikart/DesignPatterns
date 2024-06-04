package designpatterns.demo.mediatorpattern;

import javax.naming.SizeLimitExceededException;

public interface AirTrafficTower {
	
	public void handleRequestTakeOff(AbstractAirPlane airPlane) throws SizeLimitExceededException;
	
	public void handleRequestLanding(AbstractAirPlane airPlane) throws SizeLimitExceededException;
	
	public void registerNewFlights(AbstractAirPlane airPlane);
	
	public void sendNotificationToOtherFlight(String message,AbstractAirPlane airPlane);
	
	public void handleSuccessfullTakeOff(AbstractAirPlane airPlane);
	
	public void handleSuccessfullLanding(AbstractAirPlane airPlane);
	
	public Boolean checkAvailablePlatform();

}
