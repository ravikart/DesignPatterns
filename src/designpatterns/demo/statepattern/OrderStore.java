package designpatterns.demo.statepattern;

public class OrderStore {
	
	private OrderState orderState;
	
	private OrderEnum stateValue;
	
	public OrderStore(OrderEnum stateValue) {
		if(stateValue == null) {
			throw new IllegalArgumentException("StateValue can't be null");
		}
		this.stateValue = stateValue;
		this.orderState = setOrderState(stateValue);
	}
	
	public OrderState setOrderState(OrderEnum stateValue) {
		if(stateValue != null) {			
			if(stateValue == OrderEnum.ORDER_CONFIRMED) {
				this.stateValue = stateValue;
				this.orderState = new OrderConfirmedState(); 
			}else if(stateValue == OrderEnum.SHIPPING) {
				this.stateValue = stateValue;
				this.orderState = new ShippingOrderState();
			}else if(stateValue == OrderEnum.OUT_FOR_DELIVERY) {
				this.stateValue = stateValue;
				this.orderState = new OutForDeliveryOrderState();
			}else {
				this.stateValue = stateValue;
				this.orderState = new DeliveredOrderState();
			}
		}else {
		   throw new IllegalArgumentException("State Can't be Null.");	
		}
		return this.orderState;
	}
	
	public void handleOrderStateChange() {
		System.out.println("State Information: " + this.stateValue.name());
		this.orderState.handleRequest();
	}

}
