package designpatterns.demo.mediatorpattern;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.naming.SizeLimitExceededException;

public class AirportControlTower implements AirTrafficTower{
	
	private List<AbstractAirPlane> listOfFlights;
	
	private List<Integer> platformList;
	
	private static Map<Integer,AbstractAirPlane> engagingPlatForm = new LinkedHashMap<Integer, AbstractAirPlane>();
	
	public AirportControlTower() {
		listOfFlights =  new LinkedList<AbstractAirPlane>();
		platformList = IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList());
	}

	@Override
	public void handleRequestTakeOff(AbstractAirPlane abstractAirPlane) throws SizeLimitExceededException {
		Optional<Integer> availablePlatform = platformList.stream().filter((value) ->  {
			return !engagingPlatForm.containsKey(value);
		}).findFirst();
		
		if(availablePlatform.isPresent()) {
			abstractAirPlane.setTakeOffPlatform(availablePlatform.get());
			engagingPlatForm.put(availablePlatform.get(), abstractAirPlane);
			System.out.println("Flight Number "+ abstractAirPlane.getFlightNumber() + " assigned with Platform Number " + availablePlatform.get());
		}else {
			throw new SizeLimitExceededException("Sorry!, no available platform!");
		}
	}

	@Override
	public void handleRequestLanding(AbstractAirPlane abstractAirPlane) throws SizeLimitExceededException {
		Optional<Integer> availablePlatform = platformList.stream().filter((value) ->  {
			return !engagingPlatForm.containsKey(value);
		}).findFirst();
		
		if(availablePlatform.isPresent()) {
			abstractAirPlane.setLandingPlatform(availablePlatform.get());
			engagingPlatForm.put(availablePlatform.get(), abstractAirPlane);
			System.out.println("Flight Number "+ abstractAirPlane.getFlightNumber() + " assigned with Platform Number " + availablePlatform.get());
		}else {
			throw new SizeLimitExceededException("Sorry!, no available platform!");
		}
	}

	@Override
	public void registerNewFlights(AbstractAirPlane abstractAirPlane) {
		listOfFlights.add(abstractAirPlane);
	}

	@Override
	public void sendNotificationToOtherFlight(String message, AbstractAirPlane abstractAirPlane) {
		listOfFlights.stream().filter((plane) -> {
			return plane.getFlightNumber() != abstractAirPlane.getFlightNumber();
		}).forEach((plane) -> {
			plane.receiveMessage(message);
		});
	}

	@Override
	public void handleSuccessfullTakeOff(AbstractAirPlane airPlane) {
		System.out.println("Flight Number "+ airPlane.getFlightNumber() + " Successfully Take Off.");
		Integer platform = airPlane.getTakeOffPlatform();
		engagingPlatForm.remove(platform);
		airPlane.setTakeOffPlatform(-1);
	}

	@Override
	public void handleSuccessfullLanding(AbstractAirPlane airPlane) {
		Integer platform = airPlane.getLandingPlatform();
		engagingPlatForm.remove(platform);
		airPlane.setLandingPlatform(-1);
		System.out.println("Flight Number "+ airPlane.getFlightNumber() + " Successfully Landed.");
	}

	@Override
	public Boolean checkAvailablePlatform() {
		return  !(engagingPlatForm.keySet().size() == platformList.size());
	}

}
