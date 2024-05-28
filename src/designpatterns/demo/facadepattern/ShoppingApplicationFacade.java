package designpatterns.demo.facadepattern;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class ShoppingApplicationFacade implements ShoppingApplication {

	private UserEntity userEntity;

	private CartEntity cartEntity;

	private ProductHelper productHelper = ProductHelper.getInstance();

	public ShoppingApplicationFacade(UserEntity userEntity) {
		this.userEntity = userEntity;
		this.cartEntity = new CartEntity(userEntity.getCardId(),new LinkedList<ProductEntity>());
	}

	@Override
	public List<ProductEntity> addToCart(String productId, Integer productQuantity) {
		ProductEntity productDetails = productHelper.getProductDetails(productId);
		if(productDetails.getAvailableProductQuantity() > 0 
				&& productDetails.getAvailableProductQuantity() >= productQuantity) {
			System.out.println("Product Added to the Cart");
			productHelper.updateProductStock(productId,productQuantity);
			return cartEntity.addProduct(productId,productQuantity,productDetails);
		}else {
			throw new IllegalArgumentException("Mentioned Product is out of stock!!");
		}
	}

	@Override
	public List<ProductEntity> removeFromCart(String productId, Integer productQuantity) {
		System.out.println("Product Removed from the Cart");
		productHelper.updateProductStock(productId,productQuantity);
		return cartEntity.removeProduct(productId, productQuantity);
	}

	@Override
	public void listCart() {
		List<ProductEntity> productList = cartEntity.getProductList();

		productList.stream().forEach((product) -> {
			System.out.println(userEntity.getUserName());
			System.out.format("Product Name: %s, Product Quanity: %d",product.getProductName(),product.getAvailableProductQuantity());
			System.out.println();
		});
	}

	@Override
	public void checkOut() {
		List<ProductEntity> productList = cartEntity.getProductList();
		
		BigDecimal overAllTotal = new BigDecimal(0);

		productList.stream().forEach((product) -> {
			System.out.println(userEntity.getUserName());
			System.out.println("");
			System.out.format("Product Name: %s, Product Quanity: %d, Product Cost: %f",product.getProductName(),
					product.getAvailableProductQuantity(),product.getProductCost().multiply(new BigDecimal(product.getAvailableProductQuantity())));
			
			System.out.println();
		});
		
		overAllTotal = productList.stream().map((value) -> 
			value.getProductCost().multiply(new BigDecimal(value.getAvailableProductQuantity()))).reduce(BigDecimal.ZERO,BigDecimal::add);
		System.out.println("OverAll Total: "+ overAllTotal);
	}

}
