package designpatterns.demo.runner;

import designpatterns.demo.facadepattern.ShoppingApplication;
import designpatterns.demo.facadepattern.ShoppingApplicationFacade;
import designpatterns.demo.facadepattern.UserEntity;

public class FacadeDesignPatternRunner {
	
//	You are developing an online shopping platform 
//	that allows users to browse products, add items to their cart,
//	and proceed to checkout. The system consists 
//	of several subsystems, including product 
//	management, inventory tracking, and payment processing.

	public static void main(String[] args) {
		
		UserEntity userOne =  new UserEntity("rkarthikeyan",1);
		
		UserEntity userTwo =  new UserEntity("rsekaran",2);
		
		UserEntity userThree =  new UserEntity("nkarthikeyan",3);
		
		ShoppingApplication shoppingFacade =  new ShoppingApplicationFacade(userOne);

		ShoppingApplication shoppingFacadeTwo =  new ShoppingApplicationFacade(userTwo);

		ShoppingApplication shoppingFacadeThree =  new ShoppingApplicationFacade(userThree);
		
		shoppingFacade.addToCart("car", 10);
		shoppingFacade.addToCart("bike", 10);
		shoppingFacade.addToCart("cycle", 10);
		
		shoppingFacade.listCart();
		
		
		shoppingFacadeTwo.addToCart("car", 10);
		shoppingFacadeTwo.addToCart("bike", 10);
		shoppingFacadeTwo.addToCart("cycle", 10);
		
		shoppingFacadeTwo.listCart();
		
//		shoppingFacadeThree.addToCart("car", 10);
//		shoppingFacadeThree.addToCart("bike", 10);
//		shoppingFacadeThree.addToCart("cycle", 10);
		
		shoppingFacadeThree.listCart();
		
		shoppingFacade.checkOut();
		shoppingFacadeTwo.checkOut();
		shoppingFacadeThree.checkOut();
		

	}

}
