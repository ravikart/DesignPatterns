package designpatterns.demo.abstractfactorypattern;

public class SedonCar extends Car{
	
	private Region region;
	
	protected SedonCar(Region region) {
		this.region = region;
	}

	@Override
	public void assembleCar() {
		System.out.println("Assembling the Sedon Car in " + region.name() + " Region");
	}

}
