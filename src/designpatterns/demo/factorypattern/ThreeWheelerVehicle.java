package designpatterns.demo.factorypattern;

public class ThreeWheelerVehicle extends Vehicle {
	
	protected ThreeWheelerVehicle() {

	}

	@Override
	public boolean start() {
		if(isRunning) {
			System.out.println("Three Wheeler Vechile is already Running");
		}else {
			isRunning = true;
			System.out.println("Three Wheeler Vechile is Started Successfully");
		}
		return isRunning;
	}

	@Override
	public boolean stop() {
		if(isRunning) {
			isRunning = false;
			System.out.println("Three Wheeler Vechile is Stopped Successfully");
		}else {
			System.out.println("Three Wheeler Vechile is already in Stop");
		}
		return isRunning;
	}
}
