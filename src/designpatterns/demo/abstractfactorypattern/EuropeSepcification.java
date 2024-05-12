package designpatterns.demo.abstractfactorypattern;

public class EuropeSepcification extends CarSpecification{

	@Override
	public void displaySpecification() {
		System.out.println("Europe Car Specification");
		System.out.println("Drive Right Model");
		System.out.println("B7 above");
		System.out.println("Finance is Allowed only for National Banks");
	}

}
