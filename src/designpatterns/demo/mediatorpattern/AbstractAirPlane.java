package designpatterns.demo.mediatorpattern;

import javax.naming.SizeLimitExceededException;

public abstract class AbstractAirPlane implements Flights{
	
	private AirTrafficTower airTrafficTower;
	
	private Integer flightNumber;
	
	private Integer landingPlatform = -1;
	
	private Integer takeOffPlatform = -1;
	
	public Integer getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Integer getLandingPlatform() {
		return landingPlatform;
	}

	public void setLandingPlatform(Integer landingPlatform) {
		this.landingPlatform = landingPlatform;
	}

	public Integer getTakeOffPlatform() {
		return takeOffPlatform;
	}

	public void setTakeOffPlatform(Integer takeOffPlatform) {
		this.takeOffPlatform = takeOffPlatform;
	}

	public AbstractAirPlane(AirTrafficTower airTrafficTower,Integer flightNumber) {
		this.airTrafficTower = airTrafficTower;
		this.flightNumber = flightNumber;
	}

	@Override
	public void requestLanding() throws SizeLimitExceededException {
		airTrafficTower.handleRequestLanding(this);
	}

	@Override
	public void requestTakeOff() throws SizeLimitExceededException {
		airTrafficTower.handleRequestTakeOff(this);
	}
	
	@Override
	public void receiveMessage(String message) {
		System.out.println("Flight Number "+ this.flightNumber + " received message: " + message);
	}
	
	@Override
	public void sendMessageToOtherPlane(String message) {
		airTrafficTower.sendNotificationToOtherFlight(message, this);
	}
	
	@Override
	public boolean checkAvailablePlatform() {
		return airTrafficTower.checkAvailablePlatform();
	}

}
