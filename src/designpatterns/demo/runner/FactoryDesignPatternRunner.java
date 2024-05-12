package designpatterns.demo.runner;

import designpatterns.demo.factorypattern.Vehicle;
import designpatterns.demo.factorypattern.VehicleFactory;
import designpatterns.demo.factorypattern.VehicleTypeEnum;

public class FactoryDesignPatternRunner {
	//	Consider a software application that needs to handle the creation of various types of vehicles, 
	//	such as Two Wheelers, Three Wheelers, and 
	//	Four Wheelers. Each type of vehicle has its own specific properties and behaviors.

	public static void main(String[] args) {
		Vehicle twoWheelerVechile = VehicleFactory.getInstanceOfVechile(VehicleTypeEnum.TWOWHEELER);
		Vehicle threeWheelerVechile = VehicleFactory.getInstanceOfVechile(VehicleTypeEnum.THREEWHEELER);
		Vehicle fourWheelerVechile = VehicleFactory.getInstanceOfVechile(VehicleTypeEnum.FOURWHEELER);
		
		//Started for the first type
		System.out.println(twoWheelerVechile.start());
		System.out.println(threeWheelerVechile.start());
		System.out.println(fourWheelerVechile.start());
		
		//Trying to start the already running Vehicle
		System.out.println(twoWheelerVechile.start());
		System.out.println(threeWheelerVechile.start());
		System.out.println(fourWheelerVechile.start());
		
		//Trying to stop the running Vehicle
		System.out.println(twoWheelerVechile.stop());
		System.out.println(threeWheelerVechile.stop());
		System.out.println(fourWheelerVechile.stop());
		
		//Trying to stop the already stopped Vehicle
		System.out.println(twoWheelerVechile.stop());
		System.out.println(threeWheelerVechile.stop());
		System.out.println(fourWheelerVechile.stop());
	}}
