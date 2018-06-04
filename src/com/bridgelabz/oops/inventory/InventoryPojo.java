package com.bridgelabz.oops.inventory;

public class InventoryPojo {
	private String product;
	private int price;
	private int quantity;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "InventoryPojo [product=" + product + ", price=" + price + ", quantity=" + quantity + "]";
	}
	

}
