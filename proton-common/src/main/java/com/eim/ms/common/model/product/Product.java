package com.eim.ms.common.model.product;

public class Product {
	private int productId;
	private  String name;
	private  int weight;
	
	public Product(int productId, String name, int weight) {
		super();
		this.productId = productId;
		this.name = name;
		this.weight = weight;
	}
	public int getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	
	
}
