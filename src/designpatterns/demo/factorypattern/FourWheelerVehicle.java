package designpatterns.demo.factorypattern;

public class FourWheelerVehicle extends Vehicle{
	
	protected FourWheelerVehicle() {
		
	}
	
	@Override
	public boolean start() {
		if(isRunning) {
			System.out.println("Four Wheeler Vechile is already Running");
		}else {
			isRunning = true;
			System.out.println("Four Wheeler Vechile is Started Successfully");
		}
		return isRunning;
	}

	@Override
	public boolean stop() {
		if(isRunning) {
			isRunning = false;
			System.out.println("Four Wheeler Vechile is Stopped Successfully");
		}else {
			System.out.println("Four Wheeler Vechile is already in Stop");
		}
		return isRunning;
	}

}
