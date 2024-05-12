package designpatterns.demo.factorypattern;

public class TwoWheelerVehicle extends Vehicle{

	protected TwoWheelerVehicle() {

	}

	@Override
	public boolean start() {
		if(isRunning) {
			System.out.println("Two Wheeler Vechile is already Running");
		}else {
			isRunning = true;
			System.out.println("Two Wheeler Vechile is Started Successfully");
		}
		return isRunning;
	}

	@Override
	public boolean stop() {
		if(isRunning) {
			isRunning = false;
			System.out.println("Two Wheeler Vechile is Stopped Successfully");
		}else {
			System.out.println("Two Wheeler Vechile is already in Stop");
		}
		return isRunning;
	}

}
