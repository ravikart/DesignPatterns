package designpatterns.demo.abstractfactorypattern;

public class EuropeCarFactory extends CarFactory{
	
	private EuropeCarModel carModel;
	
	private EuropeCarFactory(EuropeCarModel carModel) {
		this.carModel = carModel;
	}
	
	public static CarFactory getInstance(EuropeCarModel model) {
		return new EuropeCarFactory(model);
	}

	@Override
	public Car createCar() {
		switch(carModel) {
		case EuropeCarModel.EUROPE_SEDON:
			return new SedonCar(Region.EUROPE);
		case EuropeCarModel.EUROPE_HATCHBACK:
			return new HatchBackCar(Region.EUROPE);
		default:
			break;
	}
	return null;
}

	@Override
	public CarSpecification createSpecification() {
		return new EuropeSepcification();
	}

}
