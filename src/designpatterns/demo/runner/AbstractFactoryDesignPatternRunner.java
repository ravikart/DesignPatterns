package designpatterns.demo.runner;

import designpatterns.demo.abstractfactorypattern.CarFactory;
import designpatterns.demo.abstractfactorypattern.EuropeCarFactory;
import designpatterns.demo.abstractfactorypattern.EuropeCarModel;
import designpatterns.demo.abstractfactorypattern.NorthAmericaCarModel;
import designpatterns.demo.abstractfactorypattern.NorthAmericaRegionCarFactory;

public class AbstractFactoryDesignPatternRunner {
	
//	Imagine you’re managing a global car manufacturing company. You want to 
//	design a system to create cars with specific configurations for different regions, 
//	such as North America and Europe. Each region may have unique requirements 
//	and regulations, and you want to ensure that cars produced for each region meet those standards.
	
	public static void main(String[] args) {
		CarFactory northAmericaSedonCarFactory =  NorthAmericaRegionCarFactory.getInstance(NorthAmericaCarModel.NORTH_AMERICA_SEDON);
		CarFactory northAmericaSUVCarFactory =  NorthAmericaRegionCarFactory.getInstance(NorthAmericaCarModel.NORTH_AMERICA_SUV);
		
		CarFactory europeSedonCarFactory =  EuropeCarFactory.getInstance(EuropeCarModel.EUROPE_SEDON);
		CarFactory europeHatchBackCarFactory =  EuropeCarFactory.getInstance(EuropeCarModel.EUROPE_HATCHBACK);
		
		northAmericaSedonCarFactory.createCar().assembleCar();
		northAmericaSedonCarFactory.createSpecification().displaySpecification();
		
		System.out.println("-----------------");
		
		northAmericaSUVCarFactory.createCar().assembleCar();
		northAmericaSUVCarFactory.createSpecification().displaySpecification();
		
		System.out.println("-----------------");
		
		europeSedonCarFactory.createCar().assembleCar();
		europeSedonCarFactory.createSpecification().displaySpecification();
		
		System.out.println("-----------------");
		
		europeHatchBackCarFactory.createCar().assembleCar();
		europeHatchBackCarFactory.createSpecification().displaySpecification();
		
	}

}
