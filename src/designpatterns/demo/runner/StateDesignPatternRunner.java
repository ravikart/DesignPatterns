package designpatterns.demo.runner;

import designpatterns.demo.statepattern.OrderEnum;
import designpatterns.demo.statepattern.OrderStore;

public class StateDesignPatternRunner {

	public static void main(String[] args) {
		
		OrderStore store = new OrderStore(OrderEnum.ORDER_CONFIRMED); 
		
		store.handleOrderStateChange();
		
		store.setOrderState(OrderEnum.SHIPPING);
		store.handleOrderStateChange();
		
		store.setOrderState(OrderEnum.OUT_FOR_DELIVERY);
		store.handleOrderStateChange();
		
		store.setOrderState(OrderEnum.DELIVERED);
		store.handleOrderStateChange();
		
		
	}

}
