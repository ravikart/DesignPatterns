package designpatterns.demo.flyweightpattern;

public class CappuccinoCoffee implements CoffeeType{
	
	protected CappuccinoCoffee() {
		
	}

	@Override
	public void makeCoffee() {
		System.out.println("CappuccinoCoffee is ready");
	}

}
