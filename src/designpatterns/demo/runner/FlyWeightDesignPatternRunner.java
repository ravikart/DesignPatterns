package designpatterns.demo.runner;

import designpatterns.demo.flyweightpattern.CoffeeTableHandler;
import designpatterns.demo.flyweightpattern.CoffeeType;
import designpatterns.demo.flyweightpattern.CoffeeTypeFactory;
import designpatterns.demo.flyweightpattern.DifferentCoffeeEnum;

public class FlyWeightDesignPatternRunner {

	//	You are tasked with implementing a coffee order system for a café. The café 
	//	serves various types of coffee, 
	//	and customers place orders specifying the coffee type and the table number where they are seated.

	public static void main(String[] args) {
		CoffeeType latteCoffeeType =  CoffeeTypeFactory.createCoffee(DifferentCoffeeEnum.LATTE);
		CoffeeType espressoCoffeeType =  CoffeeTypeFactory.createCoffee(DifferentCoffeeEnum.ESPRESSO);
		CoffeeType cappuccinoCoffeeType =  CoffeeTypeFactory.createCoffee(DifferentCoffeeEnum.CAPPUCCINO);

		CoffeeType latteCoffeeTypeRepeat =  CoffeeTypeFactory.createCoffee(DifferentCoffeeEnum.LATTE);
		CoffeeType espressoCoffeeTypeRepeat =  CoffeeTypeFactory.createCoffee(DifferentCoffeeEnum.ESPRESSO);
		CoffeeType cappuccinoCoffeeTypeRepeat =  CoffeeTypeFactory.createCoffee(DifferentCoffeeEnum.CAPPUCCINO);

		//Memory Check
		System.out.println("Checking the Memory of the Different Coffee Object");
		System.out.println(latteCoffeeType.equals(latteCoffeeTypeRepeat));
		System.out.println(espressoCoffeeType.equals(espressoCoffeeTypeRepeat));
		System.out.println(cappuccinoCoffeeType.equals(cappuccinoCoffeeTypeRepeat));

		CoffeeTableHandler tableOne = new CoffeeTableHandler(1,null);

		tableOne.addNewOrder(cappuccinoCoffeeTypeRepeat);
		tableOne.addNewOrder(latteCoffeeTypeRepeat);

		CoffeeTableHandler tableTwo = new CoffeeTableHandler(2,null);

		tableTwo.addNewOrder(cappuccinoCoffeeTypeRepeat);
		tableTwo.addNewOrder(latteCoffeeTypeRepeat);
		tableTwo.addNewOrder(espressoCoffeeType);
		
		System.out.println(tableOne.getOrderList().size());
		
		System.out.println(tableTwo.getOrderList().size());
		
		tableOne.placeOrder();
		tableTwo.placeOrder();

	}

}
