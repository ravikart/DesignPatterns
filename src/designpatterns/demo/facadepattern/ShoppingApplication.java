package designpatterns.demo.facadepattern;

import java.util.List;

public interface ShoppingApplication {
	
	public List<ProductEntity> addToCart(String productId,Integer productQuantity);
	
	public List<ProductEntity> removeFromCart(String productId,Integer productQuantity);
	
	public void listCart();
	
	public void checkOut();

}
