package designpatterns.demo.facadepattern;

import java.math.BigDecimal;

public class ProductEntity {
	
	private String productId;
	
	private String productName;
	
	private Integer availableProductQuantity;
	
	private BigDecimal productCost;
	
	public ProductEntity(String productId,String productName,Integer productQuanity,BigDecimal cost) {
		this.productId = productId;
		this.productName = productName;
		this.availableProductQuantity = productQuanity;
		this.productCost = cost;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getAvailableProductQuantity() {
		return availableProductQuantity;
	}

	public void setAvailableProductQuantity(Integer availableProductQuantity) {
		this.availableProductQuantity = availableProductQuantity;
	}

	public BigDecimal getProductCost() {
		return productCost;
	}

	public void setProductCost(BigDecimal productCost) {
		this.productCost = productCost;
	}

}
