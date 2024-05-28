package designpatterns.demo.facadepattern;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ProductHelper {
	
	private static Map<String,ProductEntity> productList = new HashMap<String,ProductEntity>();
	
	private static ProductHelper productHelper = null;
	
	private ProductHelper() {
		
	}
	
	static {
		ProductEntity carProduct = new ProductEntity("car","Toy Car",20,new BigDecimal(200));
		ProductEntity bikeProduct = new ProductEntity("bike","Toy Bike",20,new BigDecimal(200));
		ProductEntity cycleProduct = new ProductEntity("cycle","Toy Cycle",20,new BigDecimal(200));
		
		productList.put("car", carProduct);
		productList.put("bike", bikeProduct);
		productList.put("cycle", cycleProduct);
	}
	
	public ProductEntity getProductDetails(String productId) {
		if(productList.containsKey(productId)) {
			return productList.get(productId);
		}
		throw new IllegalArgumentException("Product Id metioned is not availabe");
	}
	
	public ProductEntity updateProductStock(String productId,Integer productQuantity) {
		if(productList.containsKey(productId)) {
			ProductEntity product =  productList.get(productId);
			product.setAvailableProductQuantity(product.getAvailableProductQuantity() - productQuantity);
			
			productList.put(productId, product);
			
			return product;
		}
		throw new IllegalArgumentException("Product Id metioned is not availabe");
	}
	
	public static ProductHelper getInstance() {
		if(productHelper == null) {
			synchronized (ProductHelper.class) {
				if(productHelper == null) {
					productHelper = new ProductHelper();
				}
			}
		}
		
		return productHelper;
	}
	
}
