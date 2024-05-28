package designpatterns.demo.flyweightpattern;

public class LatteCoffee implements CoffeeType{
	
	protected LatteCoffee() {

	}

	@Override
	public void makeCoffee() {
		System.out.println("LatteCoffee is ready");
	}

}
