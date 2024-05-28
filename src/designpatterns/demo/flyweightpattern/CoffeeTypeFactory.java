package designpatterns.demo.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class CoffeeTypeFactory {
	
	private static Map<DifferentCoffeeEnum,CoffeeType> coffeeType = new HashMap<DifferentCoffeeEnum, CoffeeType>();
	
	private CoffeeTypeFactory() {
		
	}
	
	public static CoffeeType createCoffee(DifferentCoffeeEnum menuOption) {
		if(coffeeType.containsKey(menuOption)) {
			return coffeeType.get(menuOption);
		}
		
		if(menuOption == DifferentCoffeeEnum.LATTE) {
			CoffeeType latteCoffee = new LatteCoffee();
			coffeeType.put(menuOption, latteCoffee);
		}else if(menuOption == DifferentCoffeeEnum.ESPRESSO) {
			CoffeeType espressoCoffee = new EspressoCoffee();
			coffeeType.put(menuOption, espressoCoffee);
		}else if(menuOption == DifferentCoffeeEnum.CAPPUCCINO) {
			CoffeeType cappuccinoCoffee = new CappuccinoCoffee();
			coffeeType.put(menuOption, cappuccinoCoffee);
		}else {
			throw new IllegalArgumentException("Please Enter Proper Coffee Type");
		}
		return coffeeType.get(menuOption);
	}

}
