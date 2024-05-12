package designpatterns.demo.abstractfactorypattern;

public class NorthAmericaCarSpecification extends CarSpecification{
	
	protected NorthAmericaCarSpecification() {
		
	}

	@Override
	public void displaySpecification() {
		System.out.println("North America Car Specification");
		System.out.println("Drive Left Model");
		System.out.println("B6 above");
		System.out.println("Finance is not applicable");
	}

}
