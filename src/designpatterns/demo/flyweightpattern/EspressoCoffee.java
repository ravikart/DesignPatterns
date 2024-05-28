package designpatterns.demo.flyweightpattern;

public class EspressoCoffee implements CoffeeType {

	protected EspressoCoffee() {

	}

	@Override
	public void makeCoffee() {
		System.out.println("EspressoCoffee is ready");
	}

}
