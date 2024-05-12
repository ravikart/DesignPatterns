package designpatterns.demo.abstractfactorypattern;

public abstract class CarFactory {
	
	abstract public Car createCar();
	
	abstract public CarSpecification createSpecification();
	
}
