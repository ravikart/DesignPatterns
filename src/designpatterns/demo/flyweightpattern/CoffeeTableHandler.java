package designpatterns.demo.flyweightpattern;

import java.util.LinkedList;
import java.util.List;

public class CoffeeTableHandler {
	
	private int tableNumber;
	
	private List<CoffeeType> orderList;
	
	public CoffeeTableHandler(int tableNumber,List<CoffeeType> orderList){
		this.tableNumber = tableNumber;
		this.orderList = orderList != null ? orderList : new LinkedList<CoffeeType>();
	}
	
	public void placeOrder() {
		System.out.println("Table Number: " + tableNumber);
		orderList.stream().forEach((order) -> {
			order.makeCoffee();
		});
	}
	
	public List<CoffeeType> getOrderList(){
		return this.orderList;
	}
	
	public List<CoffeeType> addNewOrder(CoffeeType newOrder){
		this.orderList.add(newOrder);
		return this.orderList;
	}

}
