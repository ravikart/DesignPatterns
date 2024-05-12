package designpatterns.demo.abstractfactorypattern;

public class NorthAmericaRegionCarFactory extends CarFactory{
	
	private NorthAmericaCarModel carModel;
	
	private NorthAmericaRegionCarFactory(NorthAmericaCarModel carModel){
		this.carModel = carModel;
	}
	
	public static CarFactory getInstance(NorthAmericaCarModel model) {
		return new NorthAmericaRegionCarFactory(model);
	}

	@Override
	public Car createCar() {
		switch(carModel) {
			case NorthAmericaCarModel.NORTH_AMERICA_SEDON:
				return new SedonCar(Region.NORTH_AMERICA);
			case NorthAmericaCarModel.NORTH_AMERICA_HATCHBACK:
				return new HatchBackCar(Region.NORTH_AMERICA);
			case NorthAmericaCarModel.NORTH_AMERICA_SUV:
				return new SUVCar(Region.NORTH_AMERICA);
			default:
				break;
		}
		return null;
	}

	@Override
	public CarSpecification createSpecification() {
		return new NorthAmericaCarSpecification();
	}
	
	

}
