package designpatterns.demo.factorypattern;

public class VehicleFactory {
	
	public static Vehicle getInstanceOfVechile(VehicleTypeEnum vechileType) {
		if(vechileType == VehicleTypeEnum.TWOWHEELER) {
			return new TwoWheelerVehicle();
		}else if(vechileType == VehicleTypeEnum.THREEWHEELER) {
			return new ThreeWheelerVehicle();
		}else if(vechileType == VehicleTypeEnum.FOURWHEELER) {
			return new FourWheelerVehicle();
		}else {
			throw new IllegalArgumentException();
		}
	}

}
