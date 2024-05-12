package designpatterns.demo.abstractfactorypattern;

public class SUVCar extends Car {
	
	private Region region;
	
	protected SUVCar(Region region) {
		this.region = region;
	}

	@Override
	public void assembleCar() {
		System.out.println("Assembling the SUV Car in " + region.name() + " Region");
	}

}
