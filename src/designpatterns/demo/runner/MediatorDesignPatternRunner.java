package designpatterns.demo.runner;

import javax.naming.SizeLimitExceededException;

import designpatterns.demo.mediatorpattern.AirPlane;
import designpatterns.demo.mediatorpattern.AirTrafficTower;
import designpatterns.demo.mediatorpattern.AirportControlTower;

public class MediatorDesignPatternRunner {
	
//	In an airport, there are multiple airplanes that need to 
//	communicate and coordinate their movements to avoid 
//	collisions and ensure safe takeoffs and landings. 
//	Without a centralized system, direct communication 
//	between airplanes could lead to chaos and increased risk.
	
//	Take Off and Landing Handled by Mediator, This will co-ordinate with other flight to ensure 
//	safe Landing and TakeOff
	
	public static void main(String[] args) throws SizeLimitExceededException {
		
		AirTrafficTower chennaiTower =  new AirportControlTower();
		
		AirPlane firstAirPlane = new AirPlane(chennaiTower, 1);
		AirPlane secondAirPlane = new AirPlane(chennaiTower, 2);
		AirPlane thirdAirPlane = new AirPlane(chennaiTower, 3);
		AirPlane fourthAirPlane = new AirPlane(chennaiTower, 4);
		AirPlane fifthAirPlane = new AirPlane(chennaiTower, 5);
		AirPlane sixthAirPlane = new AirPlane(chennaiTower, 6);
		AirPlane seventhAirPlane = new AirPlane(chennaiTower, 7);
		AirPlane eightAirPlane = new AirPlane(chennaiTower, 8);
		AirPlane ninthAirPlane = new AirPlane(chennaiTower, 9);
		AirPlane tenthAirPlane = new AirPlane(chennaiTower, 10);
		AirPlane eleventhAirPlane = new AirPlane(chennaiTower, 11);
		AirPlane twelfthAirPlane = new AirPlane(chennaiTower, 12);
		
		chennaiTower.registerNewFlights(firstAirPlane);
		chennaiTower.registerNewFlights(secondAirPlane);
		chennaiTower.registerNewFlights(thirdAirPlane);
		chennaiTower.registerNewFlights(fourthAirPlane);
		chennaiTower.registerNewFlights(fifthAirPlane);
		chennaiTower.registerNewFlights(sixthAirPlane);
		chennaiTower.registerNewFlights(seventhAirPlane);
		chennaiTower.registerNewFlights(eightAirPlane);
		chennaiTower.registerNewFlights(ninthAirPlane);
		chennaiTower.registerNewFlights(tenthAirPlane);
		chennaiTower.registerNewFlights(eleventhAirPlane);
		chennaiTower.registerNewFlights(twelfthAirPlane);
		
		firstAirPlane.sendMessageToOtherPlane("Hi This is Flight Number 1");
		
		firstAirPlane.requestTakeOff();
		secondAirPlane.requestTakeOff();
		thirdAirPlane.requestTakeOff();
		fourthAirPlane.requestTakeOff();
		System.out.println(chennaiTower.checkAvailablePlatform());
		if(chennaiTower.checkAvailablePlatform()) {			
			fifthAirPlane.requestTakeOff();
		}
		if(chennaiTower.checkAvailablePlatform()) {			
			sixthAirPlane.requestTakeOff();
			seventhAirPlane.requestTakeOff();
			eightAirPlane.requestTakeOff();
			ninthAirPlane.requestTakeOff();
			tenthAirPlane.requestLanding();
		}
		
		
		chennaiTower.handleSuccessfullTakeOff(firstAirPlane);
		chennaiTower.handleSuccessfullTakeOff(secondAirPlane);
		chennaiTower.handleSuccessfullTakeOff(thirdAirPlane);
		chennaiTower.handleSuccessfullTakeOff(fourthAirPlane);
		chennaiTower.handleSuccessfullTakeOff(fifthAirPlane);
		chennaiTower.handleSuccessfullTakeOff(sixthAirPlane);
		
		secondAirPlane.requestTakeOff();
		thirdAirPlane.requestTakeOff();
		fourthAirPlane.requestTakeOff();
		fifthAirPlane.requestTakeOff();
		sixthAirPlane.requestTakeOff();
		
		
	}

}
