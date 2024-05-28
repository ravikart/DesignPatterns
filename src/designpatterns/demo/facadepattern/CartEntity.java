package designpatterns.demo.facadepattern;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CartEntity {

	private Integer cardId;

	private List<ProductEntity> productList;

	public CartEntity(Integer cartId, List<ProductEntity> productList) {
		this.cardId = cartId;
		this.productList = productList;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public List<ProductEntity> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductEntity> productList) {
		this.productList = productList;
	}

	public List<ProductEntity> addProduct(String productId, Integer productQuantity, ProductEntity productDetails) {
		Optional<ProductEntity> productEntity = this.productList.stream().filter((product) -> product.equals(productId)).findAny();

		if(productEntity.isPresent()) {
			this.productList = this.productList.stream().map((product) -> {
				product.setAvailableProductQuantity(product.getAvailableProductQuantity() + productQuantity);
				return product;
			}).collect(Collectors.toList());
		}else {
			this.productList.add(new ProductEntity(productId, productDetails.getProductName(), productQuantity, productDetails.getProductCost()));
		}
		
		return this.productList;
	}

	public List<ProductEntity> removeProduct(String productId,Integer productQuantity) {
		Optional<ProductEntity> productEntity = this.productList.stream().filter((product) -> product.equals(productId)).findAny();

		if(productEntity.isPresent() && productEntity.get().getAvailableProductQuantity() > productQuantity) {
			this.productList = this.productList.stream()
			.filter((product) -> product.getProductId().equals(productId) && product.getAvailableProductQuantity() > productQuantity)
			.map((product) -> {
				product.setAvailableProductQuantity(product.getAvailableProductQuantity() - productQuantity);
				return product;
			}).collect(Collectors.toList());
		} else if(productEntity.isPresent() && productEntity.get().getAvailableProductQuantity() <= productQuantity){
			this.productList = this.productList.stream()
					.filter((product) -> !product.getProductId().equals(productId))
					.map((product) -> {
						return product;
					}).collect(Collectors.toList());
		}
		
		return this.productList;
	}

}
