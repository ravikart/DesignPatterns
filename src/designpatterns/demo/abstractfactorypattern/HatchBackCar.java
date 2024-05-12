package designpatterns.demo.abstractfactorypattern;

public class HatchBackCar extends Car{
	
	private Region region;
	
	protected HatchBackCar(Region region) {
		this.region = region;
	}

	@Override
	public void assembleCar() {
		System.out.println("Assembling the HatchBack Car in " + region.name() + " Region");
	}

}
